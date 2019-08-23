package com.neuedu.pojo;

public class PrescriptionPack {
	
	private Prescription prescription;
	
	private Prescriptiondetailed prescriptiondetailed;
	
	private Drugs drugs;

	public Drugs getDrugs() {
		return drugs;
	}

	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public Prescriptiondetailed getPrescriptiondetailed() {
		return prescriptiondetailed;
	}

	public void setPrescriptiondetailed(Prescriptiondetailed prescriptiondetailed) {
		this.prescriptiondetailed = prescriptiondetailed;
	}
	
	

}
