package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.Constantitem;
import com.neuedu.pojo.User;
import com.neuedu.service.ConstantitemService;
import com.neuedu.util.ResultDTO;

@Controller
@RequestMapping("constantitem")
public class ConstantitemController {

	@Autowired
	private ConstantitemService constantitemService;
	
	//获取全部常数项
	@ResponseBody
    @RequestMapping("/getallconstantitem")
    public ResultDTO<List<Constantitem>> getallconstantitem(){
        ResultDTO<List<Constantitem>>  resultDTO = new ResultDTO<>();
        try {
            
            resultDTO.setData(constantitemService.getAllConstantitem());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获取失败！");
        }
        return resultDTO;
    }
}
