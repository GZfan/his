package com.neuedu.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.pojo.DailySettleAccounts;
import com.neuedu.pojo.Patientcosts;
import com.neuedu.pojo.PatientcostsSearchRequire;
import com.neuedu.pojo.User;
import com.neuedu.service.RegisterService;

public class RegisterServiceTest extends BaseTest {

	@Autowired
	private RegisterService registerservice;
	
	//@Test
	public void getDailySettleAccountStartTime() {
		User user=new User();
		user.setId(10);
		Date date=registerservice.getDailySettleAccountStartTime(user);
		System.out.println(date);
		return;
	}
	@Test
	public void getDailySettleAccountsTest() throws Exception{
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startDate=sd.parse("2019-08-21 00:00:00");
		Date enDate=sd.parse("2019-08-23 00:00:00");
		DailySettleAccounts dailySettleAccounts=new DailySettleAccounts();
		dailySettleAccounts.setStarttime(startDate);
		dailySettleAccounts.setEndtime(enDate);
		User user=new User();
		user.setRealname("挂号收费员");
		user.setId(10);
		user.setUsetype(2);
		//registerservice.getDailySettleAccounts(dailySettleAccounts, user);
		//registerservice.makeDailySettleAccounts(dailySettleAccounts, user);
		//registerservice.searchdailySettleAccounts(dailySettleAccounts, user);
		//registerservice.getInvoiceDetail(dailySettleAccounts, user);
		PatientcostsSearchRequire patientcostsSearchRequire=new PatientcostsSearchRequire();
		patientcostsSearchRequire.setStartTime(startDate);
		patientcostsSearchRequire.setEndTime(enDate);
		patientcostsSearchRequire.setCaseNumber("12345678");
		List<Patientcosts> list=registerservice.getPatientcosts(patientcostsSearchRequire);
		return ;
	}
}
