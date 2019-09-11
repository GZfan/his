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
		diseaseMapper.insert(disease);
		Integer num=(int)diseaseMapper.countByExample(null);
		disease.setId(num);
		return disease.getId();
	}

	@Override
	public void deleteById(Integer id) {
		Disease disease=diseaseMapper.selectByPrimaryKey(id);
		disease.setDelmark(0);
		diseaseMapper.updateByPrimaryKeySelective(disease);
	}

	@Override
	public void update(Disease disease) {
		diseaseMapper.updateByPrimaryKey(disease);
	}

	@Override
	public Disease getDiseaseById(Integer id) {
		return diseaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Disease> getAllDisease() {
		DiseaseExample diseaseExample = new DiseaseExample();
		diseaseExample.createCriteria().andDelmarkEqualTo(1);
        return diseaseMapper.selectByExample(diseaseExample);
	}

	@Override
	public List<Disease> getDisease(String name) {
		DiseaseExample diseaseExample = new DiseaseExample();
		DiseaseExample.Criteria criteria=diseaseExample.createCriteria();
		criteria.andDiseasenameLike("%"+name+"%");
		criteria.andDelmarkEqualTo(1);
		return diseaseMapper.selectByExample(diseaseExample);
	}

	@Override
	public void deleteByIds(List<Integer> ids) {
		DiseaseExample diseaseExample = new DiseaseExample();
		DiseaseExample.Criteria criteria=diseaseExample.createCriteria();
		criteria.andIdIn(ids);
		Disease disease=new Disease();
		disease.setDelmark(0);
		diseaseMapper.updateByExampleSelective(disease, diseaseExample);
	}

}
