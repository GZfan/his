package com.neuedu.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.neuedu.pojo.Settlecategory;
import com.neuedu.pojo.SettlecategoryExample;
import com.neuedu.service.CalculationTypeService;
import com.neuedu.mapper.SettlecategoryMapper;

@Service
public class CalculationTypeServiceImpl  implements CalculationTypeService{

	@Resource
	SettlecategoryMapper calculationTypeMapper;
	
	@Override
	public Integer insert(Settlecategory calculationType) {
		// TODO Auto-generated method stub
		calculationTypeMapper.insert(calculationType);
		Integer num=(int)calculationTypeMapper.countByExample(null);
		calculationType.setId(num);
        return calculationType.getId();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Settlecategory calculationType=calculationTypeMapper.selectByPrimaryKey(id);
		calculationType.setDelmark(0);
		calculationTypeMapper.updateByPrimaryKeySelective(calculationType);			
	}

	@Override
	public void update(Settlecategory calculationType) {
		// TODO Auto-generated method stub
		calculationTypeMapper.updateByPrimaryKey(calculationType);
	}

	@Override
	public Settlecategory getCalculationTypeById(Integer id) {
		// TODO Auto-generated method stub
		return calculationTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Settlecategory> getAllCalculationType() {
		// TODO Auto-generated method stub
		SettlecategoryExample calculationTypeExample = new SettlecategoryExample();
		
		return calculationTypeMapper.selectByExample(calculationTypeExample);
	}

}
