package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Department;




public interface DepartmentService {
	
	public List<Department> listDepartment();
	
	public void addDepartment(Department department);
	
	public void deleteDepartment(Integer id);
	
	public Department getDepartment(Integer id);
	
	public void updateDepartment(Department department);
	
	public void deleteDepartments(List<Integer> ids);
	
}
