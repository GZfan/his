package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import com.neuedu.pojo.UserExample;



//用户类业务接口实现类
@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public Integer insert(User user) {
		userMapper.insert(user);
		Integer num=(int) userMapper.countByExample(null);
		user.setId(num);
		return user.getId();
	}

	@Override
	public void deleteById(Integer id) {
		
		User user=userMapper.selectByPrimaryKey(id);
		user.setDelmark(0);
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void update(User user) {
		
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User getUserById(Integer id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAllUser() {
		
		UserExample userExample=new UserExample();
		return userMapper.selectByExample(userExample);
	}

}
