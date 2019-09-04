package com.neuedu.controller;

import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.ChargeList;
import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.InvoiceDetail;
import com.neuedu.pojo.Patientcosts;
import com.neuedu.pojo.PatientcostsSearchRequire;
import com.neuedu.pojo.RegistInfo;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.UnchargeItems;
import com.neuedu.pojo.User;
import com.neuedu.service.RegisterService;
import com.neuedu.util.ResultDTO;


/**   
* @Title: RegisterController.java 
* @Package com.neuedu.controller 
* @Description: 与挂号，收费,发票,挂号收费员日结有关的业务
* @version V1.0   
*/
@Controller
@RequestMapping("register")
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	//获取挂号级别和科室等
	@RequestMapping("getregistinfo")
	public @ResponseBody ResultDTO<RegistInfo> getRegistlevel() {
		ResultDTO<RegistInfo> resultDTO=new ResultDTO<>();
		try {
			RegistInfo registInfo=new RegistInfo();
			registInfo.setRegistlevel(registerService.getRegistlevels());
			registInfo.setDepartment(registerService.getDepartments());
			resultDTO.setData(registInfo);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获取挂号级别和科室等
	@RequestMapping("getdoctoravailable")
	public @ResponseBody ResultDTO<List<User>> getdoctoravailable(int registlevelID, int departmentID) {
		ResultDTO<List<User>> resultDTO=new ResultDTO<>();
		try {
			resultDTO.setData(registerService.getdoctoravailable(registlevelID, departmentID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//挂号，默认认为挂号员已经收挂号相关费用
	@RequestMapping("add")
	public @ResponseBody ResultDTO<Invoice> addRegister(@RequestBody Register register) {
		ResultDTO<Invoice> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(registerService.addRegister(register,user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("挂号成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("挂号失败！");
		}
		return resultDTO;
	}
	
	//清空相应id挂号记录
	@RequestMapping("deletebyid")
	public @ResponseBody ResultDTO<Register> deleteRegisterById(int id){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			registerService.deleteRegisterById(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
	
	//更新挂号记录
	@RequestMapping("update")
	public @ResponseBody ResultDTO<Register> updateRegister(@RequestBody Register register){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			registerService.updateRegister(register);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	
	//获取相应病历号的患者的挂号信息
	@RequestMapping("getbycasenumber")
	public @ResponseBody ResultDTO<List<Register>> getRegisterById(String caseNumber){
		ResultDTO<List<Register>> resultDTO=new ResultDTO<>();
		try {
			resultDTO.setData(registerService.getRegisterByCaseNumber(caseNumber));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
			
		} 
		return resultDTO;
	}
	
	//显示没缴费的项目
	@RequestMapping("showunchargeitem")
	public @ResponseBody ResultDTO<UnchargeItems> showUnchargeItem(int id){
		ResultDTO<UnchargeItems> resultDTO=new ResultDTO<>();
		try {
			resultDTO.setData(registerService.getUnchargeItems(id));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	
	//收费
	@RequestMapping("charge")
	public @ResponseBody ResultDTO<Register> charge(@RequestBody ChargeList list){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			registerService.charge(list,user);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("收费成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("收费失败！");
		}
		return resultDTO;
	}
	//退号
	@RequestMapping("withdraw")
	public @ResponseBody ResultDTO<Register> withdraw(int id){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			registerService.withdraw(id,user);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("退号成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("退号失败！");
		}
		return resultDTO;
	}
	
	//显示可退费的项目
	@RequestMapping("showwithdrawable")
	public @ResponseBody ResultDTO<UnchargeItems> showWithdrawableItem(int id){
		ResultDTO<UnchargeItems> resultDTO=new ResultDTO<>();
		try {
			resultDTO.setData(registerService.getWithdrawableItems(id));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	//退费
	@RequestMapping("refund")
	public @ResponseBody ResultDTO<Register> refund(@RequestBody ChargeList list){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			registerService.refund(list,user);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("退费成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("退费失败！");
		}
		return resultDTO;
	}
	
	
	//根据病例号获取需要补打的发票信息
	@RequestMapping("getunprintedreceipt")
	public @ResponseBody ResultDTO<List<Invoice>> getUnprintedReceiptByCaseNumber(String caseNumber){
		ResultDTO<List<Invoice>> resultDTO=new ResultDTO<>();
		try {
			registerService.getInvoicesByCaseNumber(caseNumber,3);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//发票补打
	@RequestMapping("reprint")
	public @ResponseBody ResultDTO<Register> rePrintInvoice(List<Integer> id){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			registerService.rePrintInvoice(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("补打成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("补打失败！");
		}
		return resultDTO;
	}
	//发票重打
	@RequestMapping("printagain")
	public @ResponseBody ResultDTO<Register> printInvoiceAgain(int id){
		ResultDTO<Register> resultDTO=new ResultDTO<Register>();
		try {
			registerService.printInvoiceAgain(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("重打成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("重打失败！");
		}
		return resultDTO;
	}
	
	//获得可重打的发票信息
	@RequestMapping("getavailableinvoices")
	public @ResponseBody ResultDTO<List<Invoice>> getAvaildableInvoicesr(String caseNumber){
		ResultDTO<List<Invoice>> resultDTO=new ResultDTO<>();
		try {
			registerService.getInvoicesByCaseNumber(caseNumber,4);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}

	//获得本次日结的开始时间
	@RequestMapping("getstarttime")
	public @ResponseBody ResultDTO<Date> getStartTime(){
		ResultDTO<Date> resultDTO=new ResultDTO<Date>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(registerService.getDailySettleAccountStartTime(user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	//获得日结单信息
	@RequestMapping("getdailysettleaccounts")
	public @ResponseBody ResultDTO<DailySettleAccounts> getdailySettleAccounts(@RequestBody DailySettleAccounts dailySettleAccounts){
		ResultDTO<DailySettleAccounts> resultDTO=new ResultDTO<>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(registerService.getDailySettleAccounts(dailySettleAccounts, user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	//进行日结
	@RequestMapping("dailysettleaccounts")
	public @ResponseBody ResultDTO<DailySettleAccounts> makedailySettleAccounts(@RequestBody DailySettleAccounts dailySettleAccounts){
		ResultDTO<DailySettleAccounts> resultDTO=new ResultDTO<>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			registerService.makeDailySettleAccounts(dailySettleAccounts, user);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("日结成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("日结失败！");
		}
		return resultDTO;
	}
	
	//获得历史日结单信息
	@RequestMapping("searchdailysettleaccounts")
	public @ResponseBody ResultDTO<List<DailySettleAccounts>> searchdailySettleAccounts(@RequestBody DailySettleAccounts dailySettleAccounts){
		ResultDTO<List<DailySettleAccounts>> resultDTO=new ResultDTO<>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(registerService.searchdailySettleAccounts(dailySettleAccounts, user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得历史日结单信息
	@RequestMapping("getinvoicedetail")
	public @ResponseBody ResultDTO<List<InvoiceDetail>> getInvoiceDetail(@RequestBody DailySettleAccounts dailySettleAccounts){
		ResultDTO<List<InvoiceDetail>> resultDTO=new ResultDTO<>();
		try {
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(registerService.getInvoiceDetail(dailySettleAccounts, user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获取相应病历号的费用
	@RequestMapping("getpatientcosts")
	public @ResponseBody ResultDTO<List<Patientcosts>> getPatientcosts(@RequestBody PatientcostsSearchRequire patientcostsSearchRequire){
		ResultDTO<List<Patientcosts>> resultDTO=new ResultDTO<>();
		try {
			resultDTO.setData(registerService.getPatientcosts(patientcostsSearchRequire));
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
