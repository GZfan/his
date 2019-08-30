package com.neuedu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {

	public static Date getCurrDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(new Date());
		Date now =new Date();
		try {
		    now =df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return now;
	}
	
	public static Date getDay() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String date = df.format(new Date());
		Date now =new Date();
		try {
		    now =df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return now;
	}
}
