package com.neuedu.service;

import java.util.List;
import com.neuedu.pojo.*;;

//药品类业务接口
public interface DrugService {

	Integer insertSelective(Drugs drugs);
    void deleteById(Integer id);
    void update(Drugs drugs);
    Drugs getDrugsById(Integer id);
    List<Drugs> getDrugsByMnemoniccode(String mnemoniccode);
    List<Drugs> getAllDrugs();
    
    public List<Drugs> getDrugsOnConditions(Drugs drugs);
    
    public List<Drugstemplate> getDrugstemplate(User user);
    
    public void insertDrugstemplate(Drugstemplate drugstemplate);
    
    public void updateDrugstemplate(Drugstemplate drugstemplate);
    
    public void deleteDrugstemplate(int id);
    
    public void insertDrugsDetailed(List<Drugsdetailed> drugsdetaileds);
    
    public void deleteDrugsDetailed(List<Integer> ids);
    
    public List<DrugsDetailedAndDrug> getDrugsDetailedAndDrug(int drugsTempID);
    
    public List<Herbaltemplate> getHerbaltemplate(User user);
    
    public void insertHerbaltemplate(Herbaltemplate herbaltemplate);
    
    public void updateHerbaltemplate(Herbaltemplate herbaltemplate);
    
    public void deleteHerbaltemplate(int id);
    
    public void insertHerbalDetailed(List<Herbaldetailed> herbaldetaileds);
    
    public void deleteHerbalDetailed(List<Integer> ids);
    
    public List<HerbalTempDetailedAndDrugs> getHerbalTempDetailedAndDrug(int herbalTempID);
	
	
}
