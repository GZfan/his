																																		package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.User;
import com.neuedu.util.ResultDTO;

@Controller
public class Login {

	@RequestMapping(value = "logon",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public ResultDTO logon(HttpServletRequest request){
			ResultDTO result=new ResultDTO();
			//获取登陆的参数
			String loginName = request.getParameter("loginname");
			String password=request.getParameter("password");
            UsernamePasswordToken token = new UsernamePasswordToken(
                    loginName, password, true);
			Subject subject = SecurityUtils.getSubject();
		try {
			//登陆
			subject.login(token);
			if (subject.isAuthenticated()) {	
				result.setStatus("ok");
				result.setMsg("登录成功");
				return result;
			}
		} catch (IncorrectCredentialsException e) {
			result.setMsg("用户名或密码错误！");
		} catch (LockedAccountException e) {
			result.setMsg("帐号已被锁定");
		} catch (DisabledAccountException e) {
			result.setMsg("帐号已被禁用");
		} catch (ExpiredCredentialsException e) {
			result.setMsg("帐号已过期");
		} catch (UnknownAccountException e) {
			result.setMsg("用户不存在");
		} catch (UnauthorizedException e) {
			result.setMsg("您没有得到相应的授权");
		}
		return result;
	}
	
	@RequestMapping(value = "logout",method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO logout(){
		ResultDTO resultDTO=new ResultDTO();
		try {
			SecurityUtils.getSubject().logout();
			resultDTO.setStatus("OK");
			resultDTO.setMsg("退出成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("退出失败！");
		}
		return resultDTO;
	}
	
	
	@RequestMapping(value = "testrole1",method = RequestMethod.GET)
	@ResponseBody
	public ResultDTO testRole1(){
		ResultDTO resultDTO=new ResultDTO();
		
		try {
			Subject subject = SecurityUtils.getSubject();  
			Session session = subject.getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(user);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("失败！");
		}
		return resultDTO;
	}
	
}
 
