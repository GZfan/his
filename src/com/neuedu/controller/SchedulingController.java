package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neuedu.service.*;
import com.neuedu.service.impl.*;
import com.neuedu.util.*;
import com.neuedu.pojo.Rule;
import java.util.Map;

@Controller
@RequestMapping("/scheduling")
public class SchedulingController {

	@Autowired
	SchedulingService schedulingService;
	
	//插入排班规则
	@ResponseBody
    @RequestMapping("/insertRule")
    public ResultDTO<Rule> insertRule(@RequestBody Rule rule){
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.insertRule(rule);
            resultDTO.setData(rule);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入排班规则失败！");
        }
        return resultDTO;
    }
	
    
    //删除排班规则 经id
    @ResponseBody
    @RequestMapping("/deleteRule")
    public ResultDTO<Rule> deleteRule(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.deleteRuleById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除排班规则失败！");
        }
        return resultDTO;
    }
    

    //查询排班规则 经id
    @ResponseBody
    @RequestMapping("/getSchedulingRuleById")
    public ResultDTO<Rule> getSchedulingRuleById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getSchedulingRuleById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询排班规则失败！");
        }
        return resultDTO;
    }
    
    
    //展示所有排班规则
    @ResponseBody
    @RequestMapping("/getAllSchedulingRule")
    public ResultDTO<Rule> getAllSchedulingRule(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getAllSchedulingRule());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示排班规则失败！");
        }
        return resultDTO;
    }
    
    
	
}
