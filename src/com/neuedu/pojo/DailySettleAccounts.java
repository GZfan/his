package com.neuedu.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DailySettleAccounts {

	private String realname;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date starttime;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endtime;
	
	private double totalmoney;
	
	private int invoicenumber;

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public double getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}

	public int getInvoicenumber() {
		return invoicenumber;
	}

	public void setInvoicenumber(int invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	
	
}
