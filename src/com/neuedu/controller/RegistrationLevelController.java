package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.util.ResultDTO;
import com.neuedu.pojo.Registlevel;
import com.neuedu.service.RegistrationLevelService;

@Controller
@RequestMapping("/registrationLevel")
public class RegistrationLevelController {
	@Autowired
    RegistrationLevelService registrationLevelService;
	
	//插入挂号级别
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Registlevel> insert(@RequestBody Registlevel registrationLevel){
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.insert(registrationLevel);
            resultDTO.setData(registrationLevel);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入挂号级别失败！");
        }
        return resultDTO;
    }
	
	//删除挂号级别 经id
	@ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Registlevel> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除挂号级别失败！");
        }
        return resultDTO;
    }
	
	//更新挂号级别
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Registlevel> update(@RequestBody Registlevel registrationLevel){
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.update(registrationLevel);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新挂号级别失败！");
        }
        return resultDTO;
    }
    
	//查询挂号级别 经id
	@ResponseBody
    @RequestMapping("/getRegistrationLevelById")
    public ResultDTO<Registlevel> getRegistrationLevelById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationLevelService.getRegistrationLevelById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询挂号级别失败！");
        }
        return resultDTO;
    }
	
	
	//展示所有挂号级别
	@ResponseBody
    @RequestMapping("/getAllRegistrationLevel")
    public ResultDTO<Registlevel> getAllRegistrationLevel(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationLevelService.getAllRegistrationLevel());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示挂号级别失败！");
        }
        return resultDTO;
    }
	
}
