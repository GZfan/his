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
import com.neuedu.pojo.Fmeditem;

@Controller
@RequestMapping("/fmedicalItems")
public class FmedicalItemsController {

	@Autowired
    FmedicalItemsService fmedicalItemsService;
	
	//插入非药品
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Fmeditem> insert(@RequestBody Fmeditem fmedicalItems){
        System.out.println("插入费用科目"+fmedicalItems);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.insert(fmedicalItems);
            resultDTO.setData(fmedicalItems);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入非药品失败！");
        }
        return resultDTO;
    }
	
	
	//删除非药品 经id
	@ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Fmeditem> delete(Integer id){
        System.out.println("删除费用科目"+id);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除非药品失败！");
        }
        return resultDTO;
    }
    
	//更新非药品
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Fmeditem> update(@RequestBody Fmeditem fmedicalItems){
        System.out.println("更新费用科目"+fmedicalItems);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.update(fmedicalItems);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新非药品失败！");
        }
        return resultDTO;
    }
	
	//查询非药品 经id
	@ResponseBody
    @RequestMapping("/getFmedicalItemsById")
    public ResultDTO<Fmeditem> getFmedicalItemsById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(fmedicalItemsService.getFmedicalItemsById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询非药品失败！");
        }
        return resultDTO;
    }
	
	
	//搜索显示符合条件的非药品
	@ResponseBody
    @RequestMapping("/getFmedicalItems")
    public ResultDTO<Fmeditem> getAllFmedicalItems(@RequestBody Fmeditem fmedicalItems){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(fmedicalItemsService.getFmedicalItems(fmedicalItems));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示非药品失败！");
        }
        return resultDTO;
    }
	
    
    
	
}
