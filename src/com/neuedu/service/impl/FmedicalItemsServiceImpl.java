package com.neuedu.service.impl;

import javax.annotation.Resource;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.FmeditemExample;
import com.neuedu.service.FmedicalItemsService;
import com.neuedu.mapper.FmeditemMapper;


@Service
public class FmedicalItemsServiceImpl implements FmedicalItemsService {

	@Resource
	FmeditemMapper fmedicalItemsMapper;
	
	@Override
	public Integer insert(Fmeditem fmedicalItems) {
		// TODO Auto-generated method stub
		fmedicalItemsMapper.insert(fmedicalItems);
		Integer num=(int)fmedicalItemsMapper.countByExample(null);
		fmedicalItems.setId(num);
		return fmedicalItems.getId();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Fmeditem fmedicalItems=fmedicalItemsMapper.selectByPrimaryKey(id);
		fmedicalItems.setDelmark(0);
		fmedicalItemsMapper.updateByPrimaryKeySelective(fmedicalItems);
	}

	@Override
	public void update(Fmeditem fmedicalItems) {
		// TODO Auto-generated method stub
		fmedicalItemsMapper.updateByPrimaryKey(fmedicalItems);
	}

	@Override
	public List<Fmeditem> getFmedicalItems(Fmeditem fmedicalItems) {
		// TODO Auto-generated method stub
		FmeditemExample fmeditemExample=new FmeditemExample();
		FmeditemExample.Criteria criteria =fmeditemExample.createCriteria();
		if(fmedicalItems.getItemcode()!=null)
		{
			criteria.andItemcodeEqualTo(fmedicalItems.getItemcode());
		}
		
		if(fmedicalItems.getItemname()!=null)
		{
			criteria.andItemnameEqualTo(fmedicalItems.getItemname());
		}
		
		if(fmedicalItems.getExpclassid()!=null)
		{
			criteria.andExpclassidEqualTo(fmedicalItems.getExpclassid());
		}
		
		if(fmedicalItems.getDeptid()!=null)
		{
			criteria.andDeptidEqualTo(fmedicalItems.getDeptid());
		}
		
		return fmedicalItemsMapper.selectByExample(fmeditemExample);
	}

	@Override
	public Fmeditem getFmedicalItemsById(Integer id) {
		// TODO Auto-generated method stub
		
		return fmedicalItemsMapper.selectByPrimaryKey(id);
	}

}
