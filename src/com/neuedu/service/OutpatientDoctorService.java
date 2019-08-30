package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.Checkrelation;
import com.neuedu.pojo.Checktemplate;
import com.neuedu.pojo.Disease;
import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.Herbaldetailed;
import com.neuedu.pojo.HerbaldetailedAndDrug;
import com.neuedu.pojo.Herbalprescription;
import com.neuedu.pojo.Medicaldisease;
import com.neuedu.pojo.Medicalrecord;
import com.neuedu.pojo.Prescription;
import com.neuedu.pojo.Prescriptiondetailed;
import com.neuedu.pojo.PrescriptiondetailedAndDrug;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.User;

public interface OutpatientDoctorService {

	public List<Register> getRegisterList(User user,int visitstate);
	
	public List<Register> getRegisterByName(String name,User user);
	
	
	public Medicalrecord getMedicalRecordByRegistID(int registID);
	
	public int insertMedicalrecord(Medicalrecord medicalrecord);
	
	public void updateMedicalrecord(Medicalrecord medicalrecord);
	
	
	
	public void insertMedicalDiseases(List<Medicaldisease> medicaldiseases);
	
	public void updateMedicalDiseases(List<Medicaldisease> medicaldiseases);
	
	public void deleteMedicalDiseases(List<Integer> ids);
	
	public List<Medicaldisease> getMedicaldiseasesByRegistID(int registID);
	
	
	
	public List<Disease> getDiseases(int dicaType);
	
	
	
	public List<Checktemplate> getChecktemplates(int recordType,User user);
	
	public void insertChecktemplate(Checktemplate checktemplate);
	
	public void updateChecktemplate(Checktemplate checktemplate);
	
	public void deleteChecktemplate(int id);
	
	public List<Checktemplate> getChecktemplate(Checktemplate checktemplate);
	
	
	
	public void insertCheckRelations(List<Checkrelation> checkrelations);
	
	public void deleteCheckRelations(List<Integer> ids);
	
	public List<Checkrelation> getCheckRelationByCheckTempID(int checktempID);
	
	
	
	public List<Fmeditem> getFmeditem(int checkTempID);
	
	
	public List<CheckPack> getCheckPacks(Integer registID,Integer recordType);
	
	
	public List<Fmeditem> getCertainFmeditems(Fmeditem fmeditem);
	
	
	public void insertCheckapplys(List<Checkapply> checkapplies);
	
	public void updateCheckapplys(List<Checkapply> checkapplies);
	
	public void deleteCheckapplys(List<Integer> ids);
	
	
	public void insertPrescription(Prescription prescription);
	
	public void deletePrescription(int id);
	
	public void updatePrescription(Prescription prescription);
	
	public List<Prescription> getPrescriptionByRegistID(int registID);
	
	public void insertPrescriptionDetaileds(List<Prescriptiondetailed> prescriptiondetaileds);
	
	public void deletePrescriptionDetaileds(List<Integer> ids);
	
	public List<PrescriptiondetailedAndDrug> getPrescriptiondetailedsByPrescriptionID(int prescriptionID);
	
	
	
	
	public void insertHerbalPrescription(Herbalprescription herbalprescription);
	
	public void deleteHerbalprescription(int id);
	
	public void updateHerbalprescription(Herbalprescription herbalprescription);
	
	public List<Herbalprescription> getHerbalprescriptionByRegistID(int prescriptionID);
	
	public void insertHerbalDetailed(List<Herbaldetailed> herbaldetaileds);
	
	public void deleteHerbalDetailed(List<Integer> ids);
	
	public List<HerbaldetailedAndDrug> getHerbaldetailedsByHerbalPrescriptionID(int herbalpresID);
}
