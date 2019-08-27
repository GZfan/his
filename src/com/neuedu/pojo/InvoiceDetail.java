package com.neuedu.pojo;

import java.util.List;

public class InvoiceDetail {

	private Invoice invoice;
	
	private String realname;
	
	private List<Patientcosts> items;

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public List<Patientcosts> getItems() {
		return items;
	}

	public void setItems(List<Patientcosts> items) {
		this.items = items;
	}
	
	
}
