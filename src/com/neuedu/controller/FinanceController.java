package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.InvoiceDetail;
import com.neuedu.service.FinanceService;
import com.neuedu.util.ResultDTO;

@Controller
@RequestMapping("/finance")
public class FinanceController {

	
	@Autowired
	private FinanceService financeService;
	
	//获取日结核对信息
	@RequestMapping("getdailycheck")
	public @ResponseBody ResultDTO<List<InvoiceDetail>> getDailyCheck(@RequestBody DailySettleAccounts dailySettleAccounts) {
		ResultDTO<List<InvoiceDetail>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(financeService.getDailyCheck(dailySettleAccounts));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//进行日结核对
	@RequestMapping("makedailycheck")
	public @ResponseBody ResultDTO<Integer> makeDailyCheck(@RequestBody DailySettleAccounts dailySettleAccounts) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			financeService.makeDailyCheck(dailySettleAccounts);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("操作成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("操作失败！");
		}
		return resultDTO;
	}
}
