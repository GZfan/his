package com.neuedu.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ChargedMapper;
import com.neuedu.mapper.CheckapplyMapper;
import com.neuedu.mapper.CheckrelationMapper;
import com.neuedu.mapper.ChecktemplateMapper;
import com.neuedu.mapper.DiseaseMapper;
import com.neuedu.mapper.DisecategoryMapper;
import com.neuedu.mapper.FmeditemMapper;
import com.neuedu.mapper.HerbaldetailedMapper;
import com.neuedu.mapper.HerbalprescriptionMapper;
import com.neuedu.mapper.MedicaldiseaseMapper;
import com.neuedu.mapper.MedicalrecordMapper;
import com.neuedu.mapper.PrescriptionMapper;
import com.neuedu.mapper.PrescriptiondetailedMapper;
import com.neuedu.mapper.RegisterMapper;
import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import com.neuedu.pojo.Checkrelation;
import com.neuedu.pojo.CheckrelationExample;
import com.neuedu.pojo.Checktemplate;
import com.neuedu.pojo.ChecktemplateExample;
import com.neuedu.pojo.Disease;
import com.neuedu.pojo.DiseaseExample;
import com.neuedu.pojo.Disecategory;
import com.neuedu.pojo.DisecategoryExample;
import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.FmeditemExample;
import com.neuedu.pojo.Herbaldetailed;
import com.neuedu.pojo.HerbaldetailedAndDrug;
import com.neuedu.pojo.HerbaldetailedExample;
import com.neuedu.pojo.Herbalprescription;
import com.neuedu.pojo.HerbalprescriptionExample;
import com.neuedu.pojo.Medicaldisease;
import com.neuedu.pojo.MedicaldiseaseExample;
import com.neuedu.pojo.Medicalrecord;
import com.neuedu.pojo.MedicalrecordExample;
import com.neuedu.pojo.Prescription;
import com.neuedu.pojo.PrescriptionExample;
import com.neuedu.pojo.Prescriptiondetailed;
import com.neuedu.pojo.PrescriptiondetailedAndDrug;
import com.neuedu.pojo.PrescriptiondetailedExample;
import com.neuedu.pojo.Register;
import com.neuedu.pojo.RegisterExample;
import com.neuedu.pojo.RegisterExample.Criteria;
import com.neuedu.pojo.User;
import com.neuedu.service.OutpatientDoctorService;
import com.neuedu.util.GetDate;

@Service
public class OutpatientDoctorServiceImpl implements OutpatientDoctorService{
	
	@Autowired
	private RegisterMapper registerMapper;
	
	@Autowired
	private MedicalrecordMapper medicalrecordMapper;
	
	@Autowired
	private DiseaseMapper diseaseMapper;
	
	@Autowired
	private ChargedMapper chargeMapper;
	
	@Autowired
	private CheckapplyMapper checkapplyMapper;
	
	@Autowired
	private ChecktemplateMapper checktemplateMapper;
	
	@Autowired
	private CheckrelationMapper checkrelationMapper;
	
	@Autowired
	private DisecategoryMapper disecategoryMapper;
	
	@Autowired
	private HerbalprescriptionMapper herbalprescriptionMapper;
	
	@Autowired
	private PrescriptionMapper prescriptionMapper;
	
	@Autowired
	private FmeditemMapper fmeditemMapper;
	
	@Autowired
	private PrescriptiondetailedMapper prescriptiondetailedMapper;
	
	@Autowired
	private HerbaldetailedMapper herbaldetailedMapper;
	
	@Autowired
	private MedicaldiseaseMapper medicaldiseaseMapper;
	
	@Override
	public List<Register> getRegisterList(User user,int visitstate) {
		Date now=GetDate.getCurrDate();
		RegisterExample registerExample=new RegisterExample();
		Criteria criteria= registerExample.createCriteria();
		criteria.andUseridEqualTo(user.getId());
		criteria.andVisitdateEqualTo(GetDate.getDay());
		criteria.andVisitstateEqualTo(visitstate);
		if(now.getHours()<12) {
			criteria.andNoonEqualTo("上午");
		} else {
			criteria.andNoonEqualTo("下午");
		}
		return registerMapper.selectByExample(registerExample);
	}

	@Override
	public List<Register> getRegisterByName(String name,User user) {
		Date now=GetDate.getCurrDate();
		RegisterExample registerExample=new RegisterExample();
		Criteria criteria= registerExample.createCriteria();
		criteria.andUseridEqualTo(user.getId());
		criteria.andRealnameEqualTo(name);
		criteria.andVisitdateEqualTo(GetDate.getDay());
		criteria.andVisitstateBetween(1, 2);
		if(now.getHours()<12) {
			criteria.andNoonEqualTo("上午");
		} else {
			criteria.andNoonEqualTo("下午");
		}
		return registerMapper.selectByExample(registerExample);
	}

	
	@Override
	public Medicalrecord getMedicalRecordByRegistID(int registID) {
		MedicalrecordExample medicalrecordExample=new MedicalrecordExample();
		medicalrecordExample.createCriteria().andRegistidEqualTo(registID);
		List<Medicalrecord> list=medicalrecordMapper.selectByExample(medicalrecordExample);
		if(list.size()==0) {
			return null;
		} else {
			return list.get(0);
		}	
	}

	@Override
	public int insertMedicalrecord(Medicalrecord medicalrecord) {
		medicalrecordMapper.insertSelective(medicalrecord);
		return medicalrecord.getId();
	}

	@Override
	public void updateMedicalrecord(Medicalrecord medicalrecord) {
		medicalrecordMapper.updateByPrimaryKeySelective(medicalrecord);
	}

	@Override
	public void insertMedicalDiseases(List<Medicaldisease> medicaldiseases) {
		for(Medicaldisease medicaldisease:medicaldiseases) {
			medicaldiseaseMapper.insertSelective(medicaldisease);
		}
	}

	@Override
	public List<Disease> getDiseases(int dicaType) {
		DisecategoryExample disecategoryExample=new DisecategoryExample();
		disecategoryExample.createCriteria().andDicatypeEqualTo(dicaType);
		List<Disecategory> disecategories=disecategoryMapper.selectByExample(disecategoryExample);
		List<Integer> list=new ArrayList<Integer>();
		for(Disecategory disecategory:disecategories) {
			list.add(disecategory.getId());
		}
		DiseaseExample diseaseExample=new DiseaseExample();
		diseaseExample.createCriteria().andDisecategoryidIn(list);
		List<Disease> diseases=diseaseMapper.selectByExample(diseaseExample);
		return diseases;
	}

	@Override
	public List<Checktemplate> getChecktemplates(int recordType,User user) {
		return checktemplateMapper.selectChecktemplates(user.getId(), user.getDeptid(),recordType);
	}

	@Override
	public List<Fmeditem> getFmeditem(int checkTempID) {
		return fmeditemMapper.selectFmeditems(checkTempID);
	}

	@Override
	public List<CheckPack> getCheckPacks(Integer registID, Integer recordType) {
		List<CheckPack> list=chargeMapper.getCheckPacks(registID, recordType);
		return list;
	}

	@Override
	public List<Fmeditem> getCertainFmeditems(Fmeditem fmeditem) {
		FmeditemExample fmeditemExample=new FmeditemExample();
		com.neuedu.pojo.FmeditemExample.Criteria criteria=fmeditemExample.createCriteria();
		if(fmeditem.getItemcode()!=null) {
			criteria.andItemcodeEqualTo(fmeditem.getItemcode());
		}
		if(fmeditem.getItemname()!=null) {
			criteria.andItemnameEqualTo(fmeditem.getItemname());
		}
		if(fmeditem.getFormat()!=null) {
			criteria.andFormatEqualTo(fmeditem.getFormat());
		}
		if(fmeditem.getPrice()!=null) {
			criteria.andPriceEqualTo(fmeditem.getPrice());
		}
		if(fmeditem.getRecordtype()!=null) {
			criteria.andRecordtypeEqualTo(fmeditem.getRecordtype());
		}
		return fmeditemMapper.selectByExample(fmeditemExample);
	}

	
	@Override
	public void insertCheckapplys(List<Checkapply> checkapplies) {
		for(Checkapply item:checkapplies) {
			checkapplyMapper.insertSelective(item);
		}
	}

	@Override
	public void updateCheckapplys(List<Checkapply> checkapplies) {
		for(Checkapply item:checkapplies) {
			checkapplyMapper.updateByPrimaryKeySelective(item);
		}
	}

	@Override
	public void deleteCheckapplys(List<Integer> ids) {
		CheckapplyExample checkapplyExample=new CheckapplyExample();
		checkapplyExample.createCriteria().andIdIn(ids);
		checkapplyMapper.deleteByExample(checkapplyExample);
	}

	@Override
	public void updateMedicalDiseases(List<Medicaldisease> medicaldiseases) {
		for(Medicaldisease item:medicaldiseases) {
			medicaldiseaseMapper.updateByPrimaryKeySelective(item);
		}
	}

	@Override
	public void deleteMedicalDiseases(List<Integer> ids) {
		MedicaldiseaseExample medicaldiseaseExample=new MedicaldiseaseExample();
		medicaldiseaseExample.createCriteria().andIdIn(ids);
		medicaldiseaseMapper.deleteByExample(medicaldiseaseExample);
	}

	@Override
	public List<Medicaldisease> getMedicaldiseasesByRegistID(int registID) {
		MedicaldiseaseExample medicaldiseaseExample=new MedicaldiseaseExample();
		medicaldiseaseExample.createCriteria().andRegistidEqualTo(registID);
		return medicaldiseaseMapper.selectByExample(medicaldiseaseExample);
	}

	@Override
	public void insertPrescription(Prescription prescription) {
		prescriptionMapper.insertSelective(prescription);
	}

	@Override
	public void deletePrescription(int id) {
		prescriptionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updatePrescription(Prescription prescription) {
		prescriptionMapper.updateByPrimaryKeySelective(prescription);
	}

	@Override
	public List<Prescription> getPrescriptionByRegistID(int registID) {
		PrescriptionExample prescriptionExample=new PrescriptionExample();
		prescriptionExample.createCriteria().andRegistidEqualTo(registID);
		return prescriptionMapper.selectByExample(prescriptionExample);
	}

	@Override
	public void insertHerbalPrescription(Herbalprescription herbalprescription) {
		herbalprescriptionMapper.insertSelective(herbalprescription);
	}

	@Override
	public void deleteHerbalprescription(int id) {
		herbalprescriptionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateHerbalprescription(Herbalprescription herbalprescription) {
		herbalprescriptionMapper.updateByPrimaryKeySelective(herbalprescription);
	}

	@Override
	public List<Herbalprescription> getHerbalprescriptionByRegistID(int registID) {
		HerbalprescriptionExample herbalprescriptionExample=new HerbalprescriptionExample();
		herbalprescriptionExample.createCriteria().andRegistidEqualTo(registID);
		return herbalprescriptionMapper.selectByExample(herbalprescriptionExample);
	}

	@Override
	public void insertChecktemplate(Checktemplate checktemplate) {
		checktemplateMapper.insertSelective(checktemplate);
	}

	@Override
	public void updateChecktemplate(Checktemplate checktemplate) {
		checktemplateMapper.updateByPrimaryKeySelective(checktemplate);
	}

	@Override
	public void deleteChecktemplate(int id) {
		checktemplateMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Checktemplate> getChecktemplate(Checktemplate checktemplate) {
		ChecktemplateExample checktemplateExample=new ChecktemplateExample();
		com.neuedu.pojo.ChecktemplateExample.Criteria criteria=checktemplateExample.createCriteria();
		if(checktemplate.getName()!=null) {
			criteria.andNameEqualTo(checktemplate.getName());
		}
		if(checktemplate.getScope()!=null) {
			criteria.andScopeEqualTo(checktemplate.getScope());
		}
		if(checktemplate.getRecordtype()!=null) {
			criteria.andRecordtypeEqualTo(checktemplate.getRecordtype());
		}
		return checktemplateMapper.selectByExample(checktemplateExample);
	}

	@Override
	public void insertCheckRelations(List<Checkrelation> checkrelations) {
		for(Checkrelation checkrelation:checkrelations) {
			checkrelationMapper.insertSelective(checkrelation);
		}
	}

	@Override
	public void deleteCheckRelations(List<Integer> ids) {
		CheckrelationExample checkrelationExample=new CheckrelationExample();
		checkrelationExample.createCriteria().andIdIn(ids);
		checkrelationMapper.deleteByExample(checkrelationExample);
	}


	@Override
	public List<Checkrelation> getCheckRelationByCheckTempID(int checktempID) {
		CheckrelationExample checkrelationExample=new CheckrelationExample();
		checkrelationExample.createCriteria().andChecktempidEqualTo(checktempID);
		return checkrelationMapper.selectByExample(checkrelationExample);
	}

	@Override
	public void insertPrescriptionDetaileds(List<Prescriptiondetailed> prescriptiondetaileds) {
		for(Prescriptiondetailed item:prescriptiondetaileds) {
			prescriptiondetailedMapper.insertSelective(item);
		}
	}

	@Override
	public void deletePrescriptionDetaileds(List<Integer> ids) {
		PrescriptiondetailedExample prescriptiondetailedExample=new PrescriptiondetailedExample();
		prescriptiondetailedExample.createCriteria().andIdIn(ids);
		prescriptiondetailedMapper.deleteByExample(prescriptiondetailedExample);
	}

	@Override
	public List<PrescriptiondetailedAndDrug> getPrescriptiondetailedsByPrescriptionID(int prescriptionID) {
		return prescriptiondetailedMapper.selectPrescriptiondetailedsByPrescriptionID(prescriptionID);
	}

	@Override
	public void insertHerbalDetailed(List<Herbaldetailed> herbaldetaileds) {
		for(Herbaldetailed item:herbaldetaileds) {
			herbaldetailedMapper.insertSelective(item);
		}
	}

	@Override
	public void deleteHerbalDetailed(List<Integer> ids) {
		HerbaldetailedExample herbaldetailedExample=new HerbaldetailedExample();
		herbaldetailedExample.createCriteria().andIdIn(ids);
		herbaldetailedMapper.deleteByExample(herbaldetailedExample);
	}

	@Override
	public List<HerbaldetailedAndDrug> getHerbaldetailedsByHerbalPrescriptionID(int herbalpresID) {
		return herbaldetailedMapper.selectHerbaldetailedsByHerbalPrescriptionID(herbalpresID);
	}

	@Override
	public void updatePrescriptionDetaileds(List<Prescriptiondetailed> prescriptiondetaileds) {
		for(Prescriptiondetailed prescriptiondetailed:prescriptiondetaileds) {
			prescriptiondetailedMapper.updateByPrimaryKeySelective(prescriptiondetailed);
		}	
	}

}
