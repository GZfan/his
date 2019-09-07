package com.neuedu.service;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.ChargeList;
import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.Department;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.InvoiceDetail;
import com.neuedu.pojo.Patientcosts;
import com.neuedu.pojo.PatientcostsSearchRequire;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.UnchargeItems;
import com.neuedu.pojo.User;
import com.neuedu.util.ResultDTO;



public interface RegisterService {
	
	public List<Registlevel> getRegistlevels();
	
	public List<Department> getDepartments();
	
	public List<User> getdoctoravailable(int registlevelID,int departmentID);

	public Invoice addRegister(Register register,User user);
	
	public void deleteRegisterById(Integer id);
	
	public void updateRegister(Register register);
	
	public Register getRegisterById(int id);
	
	public List<Register> getRegisterByCaseNumber(String caseNumber);
	
	public UnchargeItems getUnchargeItems(Integer registID);
	
	public void charge(ChargeList items,User user);
	
	public void withdraw(int id,User user);
	
	public UnchargeItems getWithdrawableItems(Integer registID);
	
	public void refund(ChargeList items,User user);
	
	public List<Invoice> getInvoicesByCaseNumber(String CaseNumber,int state);
	
	public void rePrintInvoice(List<Integer> list);
	
	public void printInvoiceAgain(int id);
	
	public Date getDailySettleAccountStartTime(User user);
	
	public DailySettleAccounts getDailySettleAccounts(DailySettleAccounts dailySettleAccounts,User user);
	
	public void makeDailySettleAccounts(DailySettleAccounts dailySettleAccounts,User user);
	
	public List<DailySettleAccounts> searchdailySettleAccounts(DailySettleAccounts dailySettleAccounts,User user);
	
	public List<InvoiceDetail> getInvoiceDetail(DailySettleAccounts dailySettleAccounts,User user);
	
	public List<Patientcosts> getPatientcosts(PatientcostsSearchRequire patientcostsSearchRequire);
}
