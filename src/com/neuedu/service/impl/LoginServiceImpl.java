package com.neuedu.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findByUserName(String userName) {
		UserExample userExample=new UserExample();
		userExample.createCriteria().andUsernameEqualTo(userName);
		return userMapper.selectByExample(userExample).get(0);
	}

	@Override
	public Set<String> getRole(User user) {
		HashSet<String> roleHashSet=new HashSet<String>();
		switch (user.getDeptid().intValue()) {
		case 1: roleHashSet.add("医院管理员") ;  break;
		case 2: roleHashSet.add("挂号收费员") ;  break;
		case 3: roleHashSet.add("门诊医生") ;  break;
		case 4: roleHashSet.add("医技医生") ;  break;
		case 5: roleHashSet.add("药房操作员") ;  break;
		case 6: roleHashSet.add("财务管理员") ;  break;
		default:
			break;
		}
		return roleHashSet;
	}

}
