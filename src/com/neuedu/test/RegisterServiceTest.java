package com.neuedu.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.pojo.User;
import com.neuedu.service.RegisterService;

public class RegisterServiceTest extends BaseTest {

	@Autowired
	private RegisterService registerservice;
	
	@Test
	public void getDailySettleAccountStartTime() {
		User user=new User();
		user.setId(10);
		Date date=registerservice.getDailySettleAccountStartTime(user);
		
	}
}
