package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.ChargeList;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.UnchargeItems;



public interface RegisterService {

	public void addRegister(Register register);
	
	public void deleteRegisterById(Integer id);
	
	public void updateRegister(Register register);
	
	public List<Register> getRegisterByCaseNumber(String caseNumber);
	
	public UnchargeItems getUnchargeItems(Integer registID);
	
	public void charge(ChargeList items);
	
	public void withdraw(int id);
	
	public UnchargeItems getWithdrawableItems(Integer registID);
	
	public void refund(ChargeList items);
	
	public List<Invoice> getInvoicesByCaseNumber(String CaseNumber,int state);
	
	public void rePrintInvoice(List<Integer> list);
	
	public void printInvoiceAgain(int id);
	
}
