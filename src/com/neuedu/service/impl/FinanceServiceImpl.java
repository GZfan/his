package com.neuedu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.InvoiceMapper;
import com.neuedu.mapper.PatientcostsMapper;
import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.InvoiceDetail;
import com.neuedu.pojo.InvoiceExample;
import com.neuedu.pojo.PatientcostsExample;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private PatientcostsMapper patientcostsMapper;
	
	@Autowired
	private InvoiceMapper invoiceMapper;
	
	@Override
	public List<InvoiceDetail> getDailyCheck(DailySettleAccounts dailySettleAccounts) {
		UserExample userExample=new UserExample();
		userExample.createCriteria().andRealnameEqualTo(dailySettleAccounts.getRealname());
		int id=userMapper.selectByExample(userExample).get(0).getId();
		InvoiceExample invoiceExample=new InvoiceExample();
		com.neuedu.pojo.InvoiceExample.Criteria criteria=invoiceExample.createCriteria();
		criteria.andCreationtimeBetween(dailySettleAccounts.getStarttime(), dailySettleAccounts.getEndtime());
		criteria.andUseridEqualTo(id);
		List<Invoice> list=invoiceMapper.selectByExample(invoiceExample);
		ArrayList<InvoiceDetail> invoicelist=new ArrayList<>();
		for(Invoice invoice:list) {
			InvoiceDetail item=new InvoiceDetail();
			item.setInvoice(invoice);
			PatientcostsExample patientcostsExample=new PatientcostsExample();
			patientcostsExample.createCriteria().andInvoiceidEqualTo(invoice.getId());
			item.setItems(patientcostsMapper.selectByExample(patientcostsExample));
			invoicelist.add(item);
		}
		return null;
	}

	@Override
	public void makeDailyCheck(DailySettleAccounts dailySettleAccounts) {
		UserExample userExample=new UserExample();
		userExample.createCriteria().andRealnameEqualTo(dailySettleAccounts.getRealname());
		int id=userMapper.selectByExample(userExample).get(0).getId();
		InvoiceExample invoiceExample=new InvoiceExample();
		com.neuedu.pojo.InvoiceExample.Criteria criteria=invoiceExample.createCriteria();
		criteria.andCreationtimeBetween(dailySettleAccounts.getStarttime(), dailySettleAccounts.getEndtime());
		criteria.andUseridEqualTo(id);
		Invoice invoice=new Invoice();
		invoice.setDailystate(2);
		invoiceMapper.updateByExampleSelective(invoice, invoiceExample);
	}

}
