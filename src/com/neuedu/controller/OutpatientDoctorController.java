package com.neuedu.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.Checktemplate;
import com.neuedu.pojo.Disease;
import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.Herbalprescription;
import com.neuedu.pojo.Medicaldisease;
import com.neuedu.pojo.Medicalrecord;
import com.neuedu.pojo.Prescription;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.User;
import com.neuedu.service.OutpatientDoctorService;
import com.neuedu.util.ResultDTO;

@Controller
@RequestMapping("outpatientdoctor")
public class OutpatientDoctorController {
	
	@Autowired
	private OutpatientDoctorService outpatientdoctorservice;
	
	
	//获得已诊断的患者信息
	@RequestMapping("getregistervisited")
	public @ResponseBody ResultDTO<List<Register>> getVisitedRegisterList() {
		ResultDTO<List<Register>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(outpatientdoctorservice.getRegisterList(user, 2));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获取没看诊的患者信息
	@RequestMapping("getregisterunvisited")
	public @ResponseBody ResultDTO<List<Register>> getUnvisitedRegisterList() {
		ResultDTO<List<Register>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(outpatientdoctorservice.getRegisterList(user, 1));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获取没看诊的患者信息
	@RequestMapping("getregisterbyname")
	public @ResponseBody ResultDTO<List<Register>> getRegisterByName(String name) {
		ResultDTO<List<Register>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(outpatientdoctorservice.getRegisterByName(name, user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获取没看诊的患者信息
	@RequestMapping("getmedicalrecordbyregistid")
	public @ResponseBody ResultDTO<Medicalrecord> getMedicalRecord(int registID) {
		ResultDTO<Medicalrecord> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getMedicalRecordByRegistID(registID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//插入病例首页
	@RequestMapping("insertmedicalrecord")
	public @ResponseBody ResultDTO<Integer> insertMedicalRecord(@RequestBody Medicalrecord medicalrecord) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.insertMedicalrecord(medicalrecord));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}
	
	//更新病例首页
	@RequestMapping("updatemedicalrecord")
	public @ResponseBody ResultDTO<Integer> updateMedicalRecord(@RequestBody Medicalrecord medicalrecord) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.updateMedicalrecord(medicalrecord);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	//插入患者评估诊断表
	@RequestMapping("insertmedicaldeseases")
	public @ResponseBody ResultDTO<Integer> insertMedicalDeseases(@RequestBody List<Medicaldisease> list) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.insertMedicalDiseases(list);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}
	
	//更新患者评估诊断表
	@RequestMapping("updatemedicaldeseases")
	public @ResponseBody ResultDTO<Integer> updateMedicalDeseases(@RequestBody List<Medicaldisease> list) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.updateMedicalDiseases(list);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	//删除患者评估诊断表
	@RequestMapping("deletemedicaldeseases")
	public @ResponseBody ResultDTO<Integer> deleteMedicalDeseases(@RequestBody List<Integer> list) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.deleteMedicalDiseases(list);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
	
	//根据挂号id获取患者评估诊断表
	@RequestMapping("getMedicaldiseasesByRegistID")
	public @ResponseBody ResultDTO<Integer> getMedicaldiseasesByRegistID(int registID) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.getMedicaldiseasesByRegistID(registID);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得疾病信息
	@RequestMapping("getdiseases")
	public @ResponseBody ResultDTO<List<Disease>> getDiseases(int dicaType) {
		ResultDTO<List<Disease>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getDiseases(dicaType));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得检查/检验/处置申请模板
	@RequestMapping("getchecktemplates")
	public @ResponseBody ResultDTO<List<Checktemplate>> getChecktemplates(int recordType) {
		ResultDTO<List<Checktemplate>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(outpatientdoctorservice.getChecktemplates(recordType,user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//根据检查/检验/处置申请模板id获取相应的非药品项目
	@RequestMapping("getfmeditembychecktempid")
	public @ResponseBody ResultDTO<List<Fmeditem>> getFmeditemByCheckTempID(int checkTempID) {
		ResultDTO<List<Fmeditem>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getFmeditem(checkTempID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	//根据挂号id获取用户申请的检查/检验/处置
	@RequestMapping("getcheckpackapplyed")
	public @ResponseBody ResultDTO<List<CheckPack>> getCheckpacks(int registID,int recordType) {
		ResultDTO<List<CheckPack>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getCheckPacks(registID, recordType));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//根据条件获得非药品收费项目
	@RequestMapping("getcertainfmeditem")
	public @ResponseBody ResultDTO<List<Fmeditem>> getCertainFmeditem(@RequestBody Fmeditem fmeditem) {
		ResultDTO<List<Fmeditem>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getCertainFmeditems(fmeditem));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}

	//插入检查/检验/处置申请表
	@RequestMapping("insertcheckapplys")
	public @ResponseBody ResultDTO<Integer> insertCheckapplys(@RequestBody List<Checkapply> checkapplies){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.insertCheckapplys(checkapplies);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}
	//更新检查/检验/处置申请表
	@RequestMapping("updatecheckapplys")
	public @ResponseBody ResultDTO<Integer> updateCheckapplys(@RequestBody List<Checkapply> checkapplies){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.updateCheckapplys(checkapplies);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	//删除检查/检验/处置申请表
	@RequestMapping("deletecheckapplys")
	public @ResponseBody ResultDTO<Integer> deleteCheckapplys(@RequestBody List<Integer> checkapplies){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.deleteCheckapplys(checkapplies);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
	
	//插入患者成药处方表
	@RequestMapping("insertprescription")
	public @ResponseBody ResultDTO<Integer> insertPrescription(@RequestBody Prescription prescription){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.insertPrescription(prescription);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}
	
	//删除患者成药处方表
	@RequestMapping("deleteprescription")
	public @ResponseBody ResultDTO<Integer> deletePrescription(int id){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.deletePrescription(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
	
	//更新患者成药处方表
	@RequestMapping("updateprescription")
	public @ResponseBody ResultDTO<Integer> updatePrescription(@RequestBody Prescription prescription){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.updatePrescription(prescription);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	//根据挂号ID获取患者成药处方表
	@RequestMapping("getprescriptionbyregistid")
	public @ResponseBody ResultDTO<List<Prescription>> getPrescriptionByRegistID(int registID){
		ResultDTO<List<Prescription>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getPrescriptionByRegistID(registID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//插入草者成药处方表
	@RequestMapping("insertherbalprescription")
	public @ResponseBody ResultDTO<Integer> insertHerbalprescription(@RequestBody Herbalprescription herbalprescription){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.insertHerbalPrescription(herbalprescription);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}
	
	//删除患者草药处方表
	@RequestMapping("deleteherbalprescription")
	public @ResponseBody ResultDTO<Integer> deleteHerbalPrescription(int id){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.deleteHerbalprescription(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
	
	//更新患者草药处方表
	@RequestMapping("updateherbalprescription")
	public @ResponseBody ResultDTO<Integer> updateHerbalPrescription(@RequestBody Herbalprescription prescription){
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			outpatientdoctorservice.updateHerbalprescription(prescription);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	
	//根据挂号ID获取患者成药处方表
	@RequestMapping("getherbalprescriptionbyregistid")
	public @ResponseBody ResultDTO<List<Herbalprescription>> getHerbalPrescriptionByRegistID(int registID){
		ResultDTO<List<Herbalprescription>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(outpatientdoctorservice.getHerbalprescriptionByRegistID(registID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
}
