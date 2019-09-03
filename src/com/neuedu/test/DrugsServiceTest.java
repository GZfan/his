package com.neuedu.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.pojo.Drugs;
import com.neuedu.pojo.DrugsDetailedAndDrug;
import com.neuedu.pojo.HerbalTempDetailedAndDrugs;
import com.neuedu.pojo.Herbaltemplate;
import com.neuedu.pojo.UnchargeItems;
import com.neuedu.pojo.User;
import com.neuedu.service.DrugService;

public class DrugsServiceTest extends BaseTest {
	
	@Autowired
	private DrugService drugService;
	
	@Test
	public void getDrugsDetailedAndDrugTest() {
		//List<DrugsDetailedAndDrug> list=drugService.getDrugsDetailedAndDrug(8);
		User user=new User();
		user.setId(4);
		user.setDeptid(2);
		//List<Herbaltemplate> list=drugService.getHerbaltemplate(user);
		//List<HerbalTempDetailedAndDrugs> list=drugService.getHerbalTempDetailedAndDrug(1);
		UnchargeItems list=drugService.getDrugsToBeDistributed("600614");
		return;
	}

}
