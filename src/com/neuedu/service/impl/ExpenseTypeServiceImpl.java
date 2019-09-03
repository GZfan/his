package com.neuedu.service.impl;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;


import com.neuedu.service.ExpenseTypeService;
import com.neuedu.mapper.ExpenseclassMapper;
import com.neuedu.pojo.Expenseclass;
import com.neuedu.pojo.ExpenseclassExample;
import java.math.*;

//费用科目类接口实现类
@Service
public class ExpenseTypeServiceImpl implements ExpenseTypeService{
    @Resource
    ExpenseclassMapper expenseTypeMapper;

	@Override
	public void insertSelective(Expenseclass expenseType) {
		expenseTypeMapper.insertSelective(expenseType);
	}

	@Override
	public void deleteById(Integer id) {
		Expenseclass expenseType=expenseTypeMapper.selectByPrimaryKey(id);
		expenseType.setDelmark(0);
		expenseTypeMapper.updateByPrimaryKeySelective(expenseType);
	}

	@Override
	public void update(Expenseclass expenseType) {
		expenseTypeMapper.updateByPrimaryKey(expenseType);
	}

	@Override
	public List<Expenseclass> getAllExpenseType() {
		ExpenseclassExample expenseclassExample=new ExpenseclassExample();
		return expenseTypeMapper.selectByExample(expenseclassExample);
	}

	@Override
	public List<Expenseclass> getExpenseType(Expenseclass expenseType) {
		
		ExpenseclassExample expenseclassExample=new ExpenseclassExample();
		ExpenseclassExample.Criteria criteria = expenseclassExample.createCriteria();
		if(expenseType.getExpcode()!=null)
		{
			criteria.andExpcodeLike('%'+expenseType.getExpcode()+'%');
		}
		if(expenseType.getExpname()!=null)
		{
			criteria.andExpnameLike('%'+expenseType.getExpname()+'%');
		}
		return expenseTypeMapper.selectByExample(expenseclassExample);
	}


}
