package com.neuedu.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checktemplate;
import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.HerbaldetailedAndDrug;
import com.neuedu.pojo.PrescriptiondetailedAndDrug;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.User;
import com.neuedu.service.OutpatientDoctorService;

public class OutpatientDoctorServiceTest extends BaseTest{
	
	@Autowired
	private OutpatientDoctorService outpatientDoctorService;
	
	@Test
	public void getRegisterListTest() {
		User user=new User();
		user.setId(3);
		user.setDeptid(1);
		//outpatientDoctorService.getRegisterList(user, 1);
		//List<Register> list=outpatientDoctorService.getRegisterByName("missile", user);
		//List<Checktemplate> list=outpatientDoctorService.getChecktemplates(1,user);
		//List<Fmeditem> list=outpatientDoctorService.getFmeditem(1);
		//List<CheckPack> list=outpatientDoctorService.getCheckPacks(25, 1);
		 //List<PrescriptiondetailedAndDrug> list=outpatientDoctorService.getPrescriptiondetailedsByPrescriptionID(1);
		List<HerbaldetailedAndDrug> list=outpatientDoctorService.getHerbaldetailedsByHerbalPrescriptionID(1);
		return;
	}

}
