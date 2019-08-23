package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.service.CalculationTypeService;
import com.neuedu.util.ResultDTO;
import com.neuedu.pojo.Settlecategory;

import javax.annotation.Resource;


//结算类别类控制类
@Controller
@RequestMapping("/calculationType")
public class CalculationTypeController {
	@Autowired
    CalculationTypeService calculationTypeService;
	
	//插入结算类别
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Settlecategory> insert(@RequestBody Settlecategory calculationType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.insert(calculationType);
            resultDTO.setData(calculationType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入结算类别失败！");
        }
        return resultDTO;
    }
	
	
	//删除结算类别
	@ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Settlecategory> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除结算类别失败！");
        }
        return resultDTO;
    }
	
	//更新结算类别
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Settlecategory> update(@RequestBody Settlecategory calculationType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.update(calculationType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新结算类别失败！");
        }
        return resultDTO;
    }
	
	//查询结算类别 经id
	@ResponseBody
    @RequestMapping("/getCalculationTypeById")
    public ResultDTO<Settlecategory> getCalculationTypeById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(calculationTypeService.getCalculationTypeById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询结算类别失败！");
        }
        return resultDTO;
    }
	
	//展示所有结算类别
	@ResponseBody
    @RequestMapping("/getAllCalculationType")
    public ResultDTO<Settlecategory> getAllCalculationType(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(calculationTypeService.getAllCalculationType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示结算类别失败！");
        }
        return resultDTO;
    }
	
}
