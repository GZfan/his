package com.neuedu.service;

import java.util.List;
import com.neuedu.pojo.*;;

//药品类业务接口
public interface DrugService {

	Integer insertSelective(Drugs drugs);
    void deleteById(Integer id);
//    void deleteByCode(String code);
//    void deleteByName(String name);
    void update(Drugs drugs);
    Drugs getDrugsById(Integer id);
//    List<Drugs> getDrugsByCode(String code);
//    List<Drugs> getDrugsByName(String name);
//    List<Drugs> getDrugsByDrugsManufacturer(String drugsManufacturer);
    List<Drugs> getDrugsByMnemoniccode(String mnemoniccode);
    List<Drugs> getAllDrugs();
//    List<Drugs> getAllDrugsWithTypeAndDosage();
//    List<ConstantItems> getDrugsDosage();
//    List<ConstantItems> getDrugsType();
	
	
}
