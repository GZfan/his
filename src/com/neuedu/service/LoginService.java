package com.neuedu.service;

import java.util.Set;

import com.neuedu.pojo.User;

public interface LoginService {

	public User findByUserName(String userName);
	
	public Set<String> getRole(User user);
}
