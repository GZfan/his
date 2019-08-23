package com.neuedu.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import com.neuedu.mapper.CheckapplyMapper;
import com.neuedu.service.TechService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Service
public class TechServiceImpl implements TechService{

	@Resource
	CheckapplyMapper checkapplyMapper;
	

	@Override
	public List<Checkapply> getAllFmedical(Integer Medical_record_ID) {
		// TODO Auto-generated method stub
		CheckapplyExample checkapplyExample=new CheckapplyExample();
		CheckapplyExample.Criteria criteria =checkapplyExample.createCriteria();
		criteria.andMedicalidEqualTo(Medical_record_ID);
		//if(checkapplyMapper.countByExample(example))
		return checkapplyMapper.selectByExample(checkapplyExample);
	}


	@Override
	public void updateRegistrationStatus(Integer CheckapplyId) {
		// TODO Auto-generated method stub
		Checkapply checkapply=checkapplyMapper.selectByPrimaryKey(CheckapplyId);
		checkapply.setState(4);
		checkapplyMapper.updateByPrimaryKey(checkapply);
	}


	@Override
	public void updateCheckapply(Checkapply checkapply) {
		// TODO Auto-generated method stub
		checkapply.setState(5);
		checkapplyMapper.updateByPrimaryKey(checkapply);	
	}







}
