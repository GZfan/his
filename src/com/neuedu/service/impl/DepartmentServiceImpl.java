package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.DepartmentMapper;
import com.neuedu.pojo.Department;
import com.neuedu.pojo.DepartmentExample;
import com.neuedu.pojo.DepartmentExample.Criteria;
import com.neuedu.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public List<Department> listDepartment() {
		DepartmentExample example=new DepartmentExample();
		example.setOrderByClause("DeptCode ASC");
		return departmentMapper.selectByExample(example);
	}

	@Override
	public void addDepartment(Department department) {
		departmentMapper.insert(department);
	}

	@Override
	public void deleteDepartment(Integer id) {
		departmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Department getDepartment(Integer id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentMapper.updateByPrimaryKeySelective(department);
		
	}

	@Override
	public void deleteDepartments(List<Integer> ids) {
		DepartmentExample example = new DepartmentExample();
		Criteria creteria = example.createCriteria();
		creteria.andIdIn(ids);
		departmentMapper.deleteByExample(example);
	}

	@Override
	public Department getDepartmentByName(String name) {
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andDeptnameEqualTo(name);
		return departmentMapper.selectByExample(example).get(0);
	}

}
