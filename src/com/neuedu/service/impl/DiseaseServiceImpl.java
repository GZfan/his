package com.neuedu.service.impl;
import java.util.List;

import com.neuedu.pojo.Disease;
import com.neuedu.pojo.DiseaseExample;
import com.neuedu.service.*;
import com.neuedu.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DiseaseServiceImpl implements DiseaseService{

	@Resource
    DiseaseMapper diseaseMapper;
	
	@Override
	public Integer insert(Disease disease) {
		// TODO Auto-generated method stub
		diseaseMapper.insert(disease);
		Integer num=(int)diseaseMapper.countByExample(null);
		disease.setId(num);
		return disease.getId();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		//diseaseMapper.deleteByPrimaryKey(id);
		Disease disease=diseaseMapper.selectByPrimaryKey(id);
		disease.setDelmark(0);
		diseaseMapper.updateByPrimaryKeySelective(disease);
	}

	@Override
	public void update(Disease disease) {
		// TODO Auto-generated method stub
		diseaseMapper.updateByPrimaryKey(disease);
	}

	@Override
	public Disease getDiseaseById(Integer id) {
		// TODO Auto-generated method stub
		return diseaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Disease> getAllDisease() {
		// TODO Auto-generated method stub
		DiseaseExample diseaseExample = new DiseaseExample();
        return diseaseMapper.selectByExample(diseaseExample);
	}

	@Override
	public List<Disease> getDisease(Disease disease) {
		// TODO Auto-generated method stub
		DiseaseExample diseaseExample = new DiseaseExample();
		DiseaseExample.Criteria criteria=diseaseExample.createCriteria();
		criteria.andDiseasecodeEqualTo(disease.getDiseasecode());
		criteria.andDiseasenameEqualTo(disease.getDiseasename());
		return diseaseMapper.selectByExample(diseaseExample);
	}

}
