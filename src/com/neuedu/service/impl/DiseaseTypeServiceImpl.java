package com.neuedu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;

import com.neuedu.pojo.Disecategory;
import com.neuedu.pojo.DisecategoryExample;
import com.neuedu.pojo.DisecategoryExample.Criteria;
import com.neuedu.service.DiseaseTypeService;
import com.neuedu.mapper.DisecategoryMapper;


@Service
public class DiseaseTypeServiceImpl implements DiseaseTypeService{

	@Resource
	DisecategoryMapper diseaseTypeMapper;
	
	@Override
	public Integer insert(Disecategory diseaseType) {
		
		diseaseTypeMapper.insert(diseaseType);
		Integer num=(int)diseaseTypeMapper.countByExample(null);
		diseaseType.setId(num);
		return diseaseType.getId();
	}

	@Override
	public void deleteById(Integer id) {
		
		Disecategory diseaseType=diseaseTypeMapper.selectByPrimaryKey(id);
		diseaseType.setDelmark(0);
		diseaseTypeMapper.updateByPrimaryKeySelective(diseaseType);
	}

	@Override
	public void update(Disecategory diseaseType) {
		
		diseaseTypeMapper.updateByPrimaryKeySelective(diseaseType);
	}

	@Override
	public Disecategory getDiseaseTypeById(Integer id) {
		
		return diseaseTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Disecategory> getAllDiseaseType() {	
		DisecategoryExample diseaseTypeExample = new DisecategoryExample();
		diseaseTypeExample.createCriteria().andDelmarkEqualTo(1);
		return diseaseTypeMapper.selectByExample(diseaseTypeExample);
	}

	@Override
	public List<Disecategory> getDiseaseType(String name) {
		
		DisecategoryExample diseaseTypeExample = new DisecategoryExample();
		DisecategoryExample.Criteria criteria= diseaseTypeExample.createCriteria();
		criteria.andDicanameLike("%"+name+"%");
		criteria.andDelmarkEqualTo(1);
		return diseaseTypeMapper.selectByExample(diseaseTypeExample);
	}

	@Override
	public void deleteByIds(List<Integer> ids) {
		Disecategory disecategory=new Disecategory();
		disecategory.setDelmark(0);
		DisecategoryExample diseaseTypeExample = new DisecategoryExample();
		Criteria criteria=diseaseTypeExample.createCriteria();
		criteria.andIdIn(ids);
		diseaseTypeMapper.updateByExampleSelective(disecategory, diseaseTypeExample);
		
	}

	



	
}
