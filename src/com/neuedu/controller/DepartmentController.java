package com.neuedu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.Department;
import com.neuedu.service.DepartmentService;

import com.neuedu.util.ResultDTO;

@Controller
@RequestMapping("department")
public class DepartmentController {

	@Autowired
	DepartmentService service;

	@RequestMapping("/list")
	public @ResponseBody ResultDTO<List<Department>> listDepartment() {
		ResultDTO<List<Department>> resultDTO = new ResultDTO<>();
		try {
			resultDTO.setData(service.listDepartment());
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}

	@RequestMapping("/insert")
	public @ResponseBody ResultDTO<Department> addDepartment(@RequestBody Department department) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			service.addDepartment(department);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}

	@RequestMapping("/deletebyid")
	public @ResponseBody ResultDTO<Department> deleteDepartmentById(int id) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			service.deleteDepartment(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}

	@RequestMapping("/getbyid")
	public @ResponseBody ResultDTO<Department> getDepartmentById(int id) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			resultDTO.setData(service.getDepartment(id));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	@RequestMapping("/getbyname")
	public @ResponseBody ResultDTO<Department> getDepartmentByName(String name) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			resultDTO.setData(service.getDepartmentByName(name));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}

	@RequestMapping("/update")
	public @ResponseBody ResultDTO<Department> updateDepartment(@RequestBody Department department) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			service.updateDepartment(department);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}

	@RequestMapping("/deleteids")
	public @ResponseBody ResultDTO<Department> deleteDepartments(@RequestBody List<Integer> ids) {
		ResultDTO<Department> resultDTO = new ResultDTO<>();
		try {
			service.deleteDepartments(ids);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}

}
