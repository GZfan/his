package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neuedu.pojo.Checkapply;
import com.neuedu.service.CheckApplyService;


//TODO   不符合规范,已经废弃
@Controller
public class CheckApplyController {
	@Autowired
	CheckApplyService checkApplyService;
	
	@RequestMapping("listCheckApply")
	public @ResponseBody List<Checkapply> listCheckapply(){
		List<Checkapply> list=checkApplyService.listCheckApply();
		return list;
	}
	
	@RequestMapping("addCheckApply")
	public @ResponseBody String addCheckApply(@RequestBody Checkapply checkapply) {
		checkApplyService.addCheckApply(checkapply);
		return "{\"result\":true}";
	}
	
	@RequestMapping("getCheckApplyById")
	public @ResponseBody Checkapply getCheckApplyById(int id) {
		return checkApplyService.getCheckapply(id);
	}
	
	@RequestMapping("updateCheckApply")
	public @ResponseBody String updateCheckApply(@RequestBody Checkapply checkapply) {
		checkApplyService.updateCheckApply(checkapply);
		return "{\"result\":true}";
	}
	
	@RequestMapping("deleteCheckApplyById")
	public @ResponseBody String deleteCheckApplyById(int id) {
		checkApplyService.deleteCheckApply(id);
		return "{\"result\":true}";
	}
	
}
