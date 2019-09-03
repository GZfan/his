package com.neuedu.controller;



import java.util.List;
import com.neuedu.util.ResultDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.neuedu.pojo.User;
import com.neuedu.service.UserService;


// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;

	//插入用户
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<User> insert(@RequestBody User user){
        ResultDTO resultDTO = new ResultDTO();
        try {
            userService.insert(user);
            resultDTO.setData(user);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入用户成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入用户失败！");
        }
        return resultDTO;
    }
	
	//删除用户 经id
	@ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<User> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            userService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除用户成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除用户失败！");
        }
        return resultDTO;
    }
	
	
	//更新用户
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<User> update(@RequestBody User user){
        ResultDTO resultDTO = new ResultDTO();
        try {
            userService.update(user);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新用户成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新用户失败！");
        }
        return resultDTO;
    }
	
	//查询用户 经id
    @RequestMapping("getUserbyid")
    public ResultDTO<User> getUserById(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(userService.getUserById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询用户成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询用户失败！");
        }
        return resultDTO;
    }
	
	//展示所有用户
    @ResponseBody
    @RequestMapping("/getAllUser")
    public ResultDTO<User> getAllUser(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(userService.getAllUser());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示用户成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示用户失败！");
        }
        return resultDTO;
    }
    
	  //获得当前用户
	@RequestMapping("/getuser")
	public @ResponseBody ResultDTO<User> getUser(){
	    ResultDTO<User> resultDTO = new ResultDTO<>();
	    try {
	    	Subject subject = SecurityUtils.getSubject();  
			Session session = subject.getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(user);
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

