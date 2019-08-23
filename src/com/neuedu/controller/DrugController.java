package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

import com.neuedu.pojo.Drugs;
import com.neuedu.mapper.DrugsMapper;
import com.neuedu.pojo.DrugsExample;
import com.neuedu.service.DrugService;
import com.neuedu.util.ResultDTO;


@Controller
@RequestMapping("/drug")
public class DrugController {
	@Autowired
    DrugService drugService;
	
    @Resource
    DrugsMapper drugsMapper;
    
	//查询药品 模糊查询
    @ResponseBody
	@RequestMapping("/getdrugsbymnemoniccode")
	public ResultDTO<Drugs> getDrugsByMnemoniccode(@RequestParam(value="mnemoniccode",required=true) String mnemoniccode){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getDrugsByMnemoniccode(mnemoniccode));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询药品失败！");
        }
        return resultDTO;
	}
	
	//查询药品 根据ID
	@ResponseBody
	@RequestMapping("/getdrugsbyid")
    public ResultDTO<Drugs> getDrugsById(@RequestParam(value="id",required=true)Integer  id){
        ResultDTO resultDTO = new ResultDTO();
        
        try {
            resultDTO.setData(drugService.getDrugsById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询药品失败！");
        }
        return resultDTO;
    }
	
	
	//插入药品
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Drugs> insert(@RequestBody Drugs drugs){
        ResultDTO resultDTO = new ResultDTO();
        
        try {
            drugService.insertSelective(drugs);
            resultDTO.setData(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入药品失败！");
        }
        return resultDTO;
    }
    
    //展示所有药品
    @ResponseBody
    @RequestMapping("/getalldrugs")
    public ResultDTO<Drugs> getAllDrugs(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getAllDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }
    
    //更新药品
    @ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Drugs> update(@RequestBody Drugs drugs){
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.update(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新药品失败！");
        }
        return resultDTO;
    }
    
    //删除药品 在数据库不删除
    @ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Drugs> delete(@RequestParam(value="id",required=true)Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除药品失败！");
        }
        return resultDTO;
    }
    


}
