package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.InvoiceDetail;


public interface FinanceService {
	
	public List<InvoiceDetail> getDailyCheck(DailySettleAccounts dailySettleAccounts);
	
	public void makeDailyCheck(DailySettleAccounts dailySettleAccounts);

}
