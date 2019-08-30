package com.neuedu.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.RegisterExample;
import com.neuedu.pojo.RegisterExample.Criteria;
import com.neuedu.mapper.ChargedMapper;
import com.neuedu.mapper.CheckapplyMapper;
import com.neuedu.mapper.RegisterMapper;
import com.neuedu.service.TechService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Service
public class TechServiceImpl implements TechService{

	@Resource
	CheckapplyMapper checkapplyMapper;
	
	@Autowired
	private ChargedMapper chargeMapper;
	
	@Autowired
	private RegisterMapper registerMapper;

	@Override
	public List<Checkapply> getAllFmedical(Integer Medical_record_ID) {
		CheckapplyExample checkapplyExample=new CheckapplyExample();
		CheckapplyExample.Criteria criteria =checkapplyExample.createCriteria();
		criteria.andMedicalidEqualTo(Medical_record_ID);	
		return checkapplyMapper.selectByExample(checkapplyExample);
	}


	@Override
	public void updateRegistrationStatus(Integer CheckapplyId) {
		Checkapply checkapply=checkapplyMapper.selectByPrimaryKey(CheckapplyId);
		checkapply.setState(4);
		checkapplyMapper.updateByPrimaryKey(checkapply);
	}


	@Override
	public void updateCheckapply(Checkapply checkapply) {
		checkapply.setState(5);
		checkapplyMapper.updateByPrimaryKey(checkapply);	
	}


	@Override
	public List<Register> getRegister(String name, String casenumber) {
		RegisterExample registerExample=new RegisterExample();
		Criteria criteria=registerExample.createCriteria();
		if(name!=null) {
			criteria.andRealnameEqualTo(name);
		}
		if(casenumber!=null) {
			criteria.andCasenumberEqualTo(casenumber);
		}
		return registerMapper.selectByExample(registerExample);
	}


	@Override
	public List<CheckPack> getCheckPacks(Integer registID, Integer recordType) {
		return chargeMapper.getCheckPacksToBeCheck(registID, recordType);
	}







}
