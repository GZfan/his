package com.neuedu.pojo;

import java.util.List;

public class UnchargeItems {

	private List<CheckPack> checkPacks;
	
	private List<PrescriptionPack> prescriptionPacks;
	
	private List<HerbalPack> herbalPacks;

	public List<CheckPack> getCheckapplies() {
		return checkPacks;
	}

	public void setCheckapplies(List<CheckPack> checkapplies) {
		this.checkPacks = checkapplies;
	}

	public List<PrescriptionPack> getPrescriptionPacks() {
		return prescriptionPacks;
	}

	public void setPrescriptionPacks(List<PrescriptionPack> prescriptionPacks) {
		this.prescriptionPacks = prescriptionPacks;
	}

	public List<HerbalPack> getHerbalPacks() {
		return herbalPacks;
	}

	public void setHerbalPacks(List<HerbalPack> herbalPacks) {
		this.herbalPacks = herbalPacks;
	}
	
	
}
