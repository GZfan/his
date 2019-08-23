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
import com.neuedu.pojo.Disecategory;

@Controller
@RequestMapping("/diseaseType")
public class DiseaseTypeController {

    @Autowired
    DiseaseTypeService diseaseTypeService;
    
    //插入疾病类别
    @ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Disecategory> insert(@RequestBody Disecategory diseaseType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.insert(diseaseType);
            resultDTO.setData(diseaseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入疾病类别失败！");
        }
        return resultDTO;
    }
    
    
    //删除疾病类别
    @ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Disecategory> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除疾病类别失败！");
        }
        return resultDTO;
    }
    
    
    //更新疾病类别
    @ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Disecategory> update(@RequestBody Disecategory diseaseType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.update(diseaseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新疾病类别失败！");
        }
        return resultDTO;
    }
    
    
    //展示所有疾病类别
    @ResponseBody
    @RequestMapping("/getAllDiseaseType")
    public ResultDTO<Disecategory> getAllDiseaseType(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseTypeService.getAllDiseaseType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病类别失败！");
        }
        return resultDTO;
    }
    
    
    //精确查找
    @ResponseBody
    @RequestMapping("/getDiseaseType")
    public ResultDTO<Disecategory> getDiseaseType(@RequestBody Disecategory diseaseType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseTypeService.getDiseaseType(diseaseType));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病类别失败！");
        }
        return resultDTO;
    }
    
    
    
    
    
    
}
