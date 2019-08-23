package com.neuedu.service.impl;

import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.RegistlevelExample;
import com.neuedu.service.RegistrationLevelService;
import javax.annotation.Resource;
import java.util.List;

import com.neuedu.mapper.RegistlevelMapper;

import org.springframework.stereotype.Service;

//挂号级别类业务接口
@Service
public class RegistrationLevelServiceImpl implements RegistrationLevelService{

    @Resource
    RegistlevelMapper registrationLevelMapper;
    
	@Override
	public Integer insert(Registlevel registrationLevel) {
		// TODO Auto-generated method stub
		registrationLevelMapper.insert(registrationLevel);
		Integer num=(int) registrationLevelMapper.countByExample(null);
		registrationLevel.setId(num);
		return registrationLevel.getId();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Registlevel registrationLevel=registrationLevelMapper.selectByPrimaryKey(id);
		registrationLevel.setDelmark(0);
		registrationLevelMapper.updateByPrimaryKeySelective(registrationLevel);
	}

	@Override
	public void update(Registlevel registrationLevel) {
		// TODO Auto-generated method stub
		registrationLevelMapper.updateByPrimaryKey(registrationLevel);
	}

	@Override
	public Registlevel getRegistrationLevelById(Integer id) {
		// TODO Auto-generated method stub
		return registrationLevelMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Registlevel> getAllRegistrationLevel() {
		// TODO Auto-generated method stub
		RegistlevelExample  registrationLevelExample=new RegistlevelExample();
		return registrationLevelMapper.selectByExample(registrationLevelExample);
	}

}
