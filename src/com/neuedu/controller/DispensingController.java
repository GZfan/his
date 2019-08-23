package com.neuedu.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//似乎没用
@Controller
@RequestMapping("/dispensing")
public class DispensingController {
	@RequestMapping("/resp")
	@ResponseBody
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	    resp.getWriter().println("hello HttpServletResponse");
	  }
}
