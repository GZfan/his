package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neuedu.service.TechService;
import com.neuedu.service.impl.*;
import com.neuedu.util.*;
import com.neuedu.pojo.Checkapply;


//医技工作站Controller
//医技项目补录没有写
@Controller
@RequestMapping("/tech")
public class TechController {

	@Autowired
    TechService techService;
	
	//根据病历号获取该患者的全部项目
	@ResponseBody
    @RequestMapping("/getAllFmedical")
    public ResultDTO<Checkapply> getAllFmedical(@RequestParam(value="Medical_record_ID",required=true) String Medical_record_ID){
        System.out.println("病历号" + Medical_record_ID  );
        System.out.println("okok");
        Integer id1=Integer.valueOf(Medical_record_ID);
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(techService.getAllFmedical(id1));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询病历号成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询病历号失败！");
        }
        return resultDTO;  
    }
	
	//更新患者在该科室的登记状态，该科室的1->2
	@ResponseBody
    @RequestMapping("/updateRegistrationStatus")
    public ResultDTO updateRegistrationStatus(@RequestParam(value="CheckapplyId",required=true) String CheckapplyId) {
		Integer id1=Integer.valueOf(CheckapplyId);
        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.updateRegistrationStatus(id1);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新成功！");
            System.out.println("成功了");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新失败！");
            System.out.println("失败了");
        }
        return resultDTO;
    }
	
	
	////检查检验结果录入,并更改患者在科室的登记状态
	@ResponseBody
    @RequestMapping("/insertExaminationResult")
    public ResultDTO insertExaminationResult(@RequestBody Checkapply checkapply){

        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.updateCheckapply(checkapply);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
    }
	
	
	@RequestMapping("/resp")
	@ResponseBody
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	    resp.getWriter().println("hello HttpServletResponse");
	  }
	
	

	
}
