package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ConstantitemMapper;
import com.neuedu.pojo.Constantitem;
import com.neuedu.pojo.ConstantitemExample;
import com.neuedu.service.ConstantitemService;

@Service
public class ConstantitemServiceImpl implements ConstantitemService {

	@Autowired
	ConstantitemMapper constantitemMapper;
	
	@Override
	public List<Constantitem> getAllConstantitem() {
		ConstantitemExample constantitemExample=new ConstantitemExample();
		return constantitemMapper.selectByExample(constantitemExample);
	}

}
