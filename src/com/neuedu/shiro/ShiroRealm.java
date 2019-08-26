package com.neuedu.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.pojo.User;
import com.neuedu.service.LoginService;

public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	private LoginService loginService;

	/**
	 * 获取用户授权认可信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		if (principals == null) {
			return null;
		}

		// 因为非正常退出，即没有显式调用 SecurityUtils.getSubject().logout()
		// (可能是关闭浏览器，或超时)，但此时缓存依旧存在(principals)，所以会自己跑到授权方法里。
		if (!SecurityUtils.getSubject().isAuthenticated()) {
			doClearCache(principals);
			SecurityUtils.getSubject().logout();
			return null;
		}

		// 获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
		Session session = SecurityUtils.getSubject().getSession(false);
		String currUsername = (String) super.getAvailablePrincipal(principals);
		if (currUsername == null || session.getAttribute("user") == null) {
			return null;
		}

		// 设置权限
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		try {
			authorizationInfo.setRoles((Set<String>) session.getAttribute("roles"));
			// authorizationInfo.setStringPermissions((HashSet<String>)
			// session.getAttribute("perms"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authorizationInfo;
	}

	/**
	 * 登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		User user = loginService.findByUserName(username);
		if (user != null) {
			AuthenticationInfo authInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(),
					this.getName());
			// 根据用户查询用户拥有的角色
			Set<String> roleNameList = loginService.getRole(user);
			// 放入session中
			this.setSession("roles", roleNameList);
			// 用户名和用户信息放到session中
			this.setSession("user", user);
			this.setSession("userName", user.getUsername());
			return authInfo;
		} else {
			// 用户名密码不匹配
			throw new UnknownAccountException();
		}
	}

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用<br>
	 * 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			// log.info("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}

}
