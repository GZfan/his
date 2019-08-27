package com.neuedu.pojo;

import java.util.Date;

public class PatientcostsSearchRequire {
	
	private Date startTime;
	
	private Date endTime;
	
	private String caseNumber;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	
	
}
