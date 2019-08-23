package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.mapper.CheckapplyMapper;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import com.neuedu.service.CheckApplyService;

@Service
public class CheckApplyServiceImpl implements CheckApplyService{
	
	@Autowired
	CheckapplyMapper checkapplyMapper;
	
	public List<Checkapply> listCheckApply(){
		CheckapplyExample example=new CheckapplyExample();
		example.setDistinct(true);
		return checkapplyMapper.selectByExample(example);
	}
	@Override
    public void addCheckApply(Checkapply checkapply) {
		checkapplyMapper.insert(checkapply);
    }
    
    @Override
    public void deleteCheckApply(int id) {
    	checkapplyMapper.deleteByPrimaryKey(id);
    }
       
    @Override  
    public Checkapply getCheckapply(Integer id) {
    	return checkapplyMapper.selectByPrimaryKey(id);
    }
     
    @Override  
    public void updateCheckApply(Checkapply checkapply) {
    	checkapplyMapper.updateByPrimaryKeySelective(checkapply);
    }
}
