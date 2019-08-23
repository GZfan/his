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
import com.neuedu.pojo.*;

@Controller
@RequestMapping("/disease")
public class DiseaseController {
	
	@Autowired
    DiseaseService diseaseService;
	
	
	//插入疾病
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Disease> insert(@RequestBody Disease disease){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.insert(disease);
            resultDTO.setData(disease);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入疾病失败！");
        }
        return resultDTO;
    }
	
	
	
	
	//删除疾病
	@ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Disease> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除疾病失败！");
        }
        return resultDTO;
    }
	
	//更新疾病
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Disease> update(@RequestBody Disease disease){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.update(disease);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新疾病失败！");
        }
        return resultDTO;
    }
    
    //查询疾病 经id
	@ResponseBody
    @RequestMapping("/getDiseaseById")
    public ResultDTO<Disease> getDiseaseById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getDiseaseById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询疾病失败！");
        }
        return resultDTO;
    }
	
	//展示所有疾病
	@ResponseBody
    @RequestMapping("/getAllDisease")
    public ResultDTO<Disease> getAllDisease(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getAllDisease());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病失败！");
        }
        return resultDTO;
    }
	
	//精确查询
	@ResponseBody
    @RequestMapping("/getDisease")
    public ResultDTO<Disease> getDisease(@RequestBody Disease disease){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getDisease(disease));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病失败！");
        }
        return resultDTO;
    }
	
}
