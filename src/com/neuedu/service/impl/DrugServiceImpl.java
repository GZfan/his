package com.neuedu.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.neuedu.service.DrugService;
import com.neuedu.util.GetDate;
import com.neuedu.pojo.*;
import com.neuedu.pojo.DrugsExample.Criteria;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.mapper.*;

//药品类业务接口实现类
@Service
public class DrugServiceImpl implements DrugService{
	
	@Autowired
	private RegisterMapper registerMapper;
	
	@Autowired
	private DrugstemplateMapper drugstemplateMapper;
	
	@Autowired
	private HerbaltemplateMapper herbaltemplateMapper;
	
	@Autowired
	private DrugsdetailedMapper drugsdetailedMapper;
	
	@Autowired
	private HerbaltempdetailedMapper herbaltempdetailedMapper;
	
	@Autowired
	private HerbaldetailedMapper herbaldetailedMapper;
	
	@Autowired
	private ChargedMapper chargeMapper;
	
	@Resource
	DrugsMapper drugsMapper;
	
    @Resource
    ConstantitemMapper constantItemsMapper;
	
	
	@Override
	public List<Drugs> getDrugsByMnemoniccode(String mnemoniccode) {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andMnemoniccodeLike('%'+mnemoniccode+'%');
        return drugsMapper.selectByExample(drugsExample);
	}

	@Override
	public Drugs getDrugsById(Integer id) {
		return drugsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteById(Integer id) {
		Drugs drugs=drugsMapper.selectByPrimaryKey(id);
		drugs.setDelmark(0);
		drugsMapper.updateByPrimaryKeySelective(drugs);    
	}


	@Override
    public Integer insertSelective(Drugs drugs) {
        drugsMapper.insertSelective(drugs);
        return drugs.getId();
        
    }

	@Override
	public List<Drugs> getAllDrugs() {
		DrugsExample drugsExample = new DrugsExample();
        return drugsMapper.selectByExample(drugsExample);
	}

	@Override
	public void update(Drugs drugs) {
		drugs.setLastupdatedate(GetDate.getCurrDate());
		drugsMapper.updateByPrimaryKey(drugs);
	}

	@Override
	public List<Drugstemplate> getDrugstemplate(User user) {
		return drugstemplateMapper.selectDrugstemplate(user.getId(), user.getDeptid());
	}

	@Override
	public List<DrugsDetailedAndDrug> getDrugsDetailedAndDrug(int drugsTempID) {
		return drugsdetailedMapper.selectDrugsDetailedAndDrug(drugsTempID);
	}

	@Override
	public List<Herbaltemplate> getHerbaltemplate(User user) {
		return herbaltemplateMapper.selectHerbaltemplates(user.getId(), user.getDeptid());
	}

	@Override
	public List<HerbalTempDetailedAndDrugs> getHerbalTempDetailedAndDrug(int herbalTempID) {
		return herbaltempdetailedMapper.selectHerbalTempDetailedAndDrugs(herbalTempID);
	}

	@Override
	public List<Drugs> getDrugsOnConditions(Drugs drugs) {
		DrugsExample drugsExample=new DrugsExample();
		Criteria criteria=drugsExample.createCriteria();
		if(drugs.getDrugscode()!=null) {
			criteria.andDrugscodeEqualTo(drugs.getDrugscode());
		}
		if(drugs.getDrugsname()!=null) {
			criteria.andDrugsnameEqualTo(drugs.getDrugsname());
		}
		if(drugs.getMnemoniccode()!=null) {
			criteria.andMnemoniccodeEqualTo(drugs.getMnemoniccode());
		}
		criteria.andDelmarkEqualTo(1);
		return drugsMapper.selectByExample(drugsExample);
	}

	@Override
	public void insertDrugstemplate(Drugstemplate drugstemplate) {
		drugstemplateMapper.insertSelective(drugstemplate);
	}

	@Override
	public void updateDrugstemplate(Drugstemplate drugstemplate) {
		drugstemplateMapper.updateByPrimaryKeySelective(drugstemplate);
	}

	@Override
	public void deleteDrugstemplate(int id) {
		drugstemplateMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insertHerbaltemplate(Herbaltemplate herbaltemplate) {
		herbaltemplateMapper.insertSelective(herbaltemplate);
	}

	@Override
	public void updateHerbaltemplate(Herbaltemplate herbaltemplate) {
		herbaltemplateMapper.updateByPrimaryKeySelective(herbaltemplate);
	}

	@Override
	public void deleteHerbaltemplate(int id) {
		herbaltemplateMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void insertDrugsDetailed(List<Drugsdetailed> drugsdetaileds) {
		for(Drugsdetailed item:drugsdetaileds) {
			drugsdetailedMapper.insertSelective(item);
		}
	}

	@Override
	public void deleteDrugsDetailed(List<Integer> ids) {
		DrugsdetailedExample drugsdetailedExample=new DrugsdetailedExample();
		drugsdetailedExample.createCriteria().andIdIn(ids);
		drugsdetailedMapper.deleteByExample(drugsdetailedExample);
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
	public UnchargeItems getDrugsToBeDistributed(String CaseNumber) {
		RegisterExample example=new RegisterExample();
		com.neuedu.pojo.RegisterExample.Criteria criteria=example.createCriteria();
		criteria.andCasenumberEqualTo(CaseNumber);
		example.setOrderByClause("VisitDate DESC");
		List<Register> list= registerMapper.selectByExample(example);
		if(list.size()==0) {
			return null;
		}
		Integer registID=list.get(0).getId();
		ArrayList<Integer> state=new ArrayList<Integer>();
		state.add(3);
		UnchargeItems unchargeItems=new UnchargeItems();
		unchargeItems.setPrescriptionPacks(chargeMapper.getPrescriptionPacksByRegistID(registID, state));
		unchargeItems.setHerbalPacks(chargeMapper.getHerbalPacksByRegistID(registID, state));
		return unchargeItems;
	}

	@Override
	public UnchargeItems getDrugsToBeDrawback(String caseNumber) {
		RegisterExample example=new RegisterExample();
		com.neuedu.pojo.RegisterExample.Criteria criteria=example.createCriteria();
		criteria.andCasenumberEqualTo(caseNumber);
		example.setOrderByClause("VisitDate DESC");
		List<Register> list= registerMapper.selectByExample(example);
		if(list.size()==0) {
			return null;
		}
		Integer registID=list.get(0).getId();
		ArrayList<Integer> state=new ArrayList<Integer>();
		state.add(4);
		UnchargeItems unchargeItems=new UnchargeItems();
		unchargeItems.setPrescriptionPacks(chargeMapper.getPrescriptionPacksByRegistID(registID, state));
		unchargeItems.setHerbalPacks(chargeMapper.getHerbalPacksByRegistID(registID, state));
		return unchargeItems;
	}

	
	
}
