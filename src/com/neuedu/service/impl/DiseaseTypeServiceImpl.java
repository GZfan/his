package com.neuedu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;

import com.neuedu.pojo.Disecategory;
import com.neuedu.pojo.DisecategoryExample;
import com.neuedu.service.DiseaseTypeService;
import com.neuedu.mapper.DisecategoryMapper;


@Service
public class DiseaseTypeServiceImpl implements DiseaseTypeService{

	@Resource
	DisecategoryMapper diseaseTypeMapper;
	
	@Override
	public Integer insert(Disecategory diseaseType) {
		// TODO Auto-generated method stub
		diseaseTypeMapper.insert(diseaseType);
		Integer num=(int)diseaseTypeMapper.countByExample(null);
		diseaseType.setId(num);
		return diseaseType.getId();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		//diseaseTypeMapper.deleteByPrimaryKey(id);
		Disecategory diseaseType=diseaseTypeMapper.selectByPrimaryKey(id);
		diseaseType.setDelmark(0);
		diseaseTypeMapper.updateByPrimaryKeySelective(diseaseType);
	}

	@Override
	public void update(Disecategory diseaseType) {
		// TODO Auto-generated method stub
		diseaseTypeMapper.updateByPrimaryKey(diseaseType);
	}

	@Override
	public Disecategory getDiseaseTypeById(Integer id) {
		// TODO Auto-generated method stub
		return diseaseTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Disecategory> getAllDiseaseType() {
		// TODO Auto-generated method stub
		DisecategoryExample diseaseTypeExample = new DisecategoryExample();
		return diseaseTypeMapper.selectByExample(diseaseTypeExample);
	}

	@Override
	public List<Disecategory> getDiseaseType(Disecategory diseaseType) {
		// TODO Auto-generated method stub
		DisecategoryExample diseaseTypeExample = new DisecategoryExample();
		DisecategoryExample.Criteria criteria= diseaseTypeExample.createCriteria();
		criteria.andDicacodeEqualTo(diseaseType.getDicacode());
		criteria.andDicanameEqualTo(diseaseType.getDicaname());
		return diseaseTypeMapper.selectByExample(diseaseTypeExample);
	}



	
}
