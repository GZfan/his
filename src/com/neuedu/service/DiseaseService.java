package com.neuedu.service;

import com.neuedu.pojo.*;
import java.util.List;


//疾病业务接口
public interface DiseaseService {

    Integer insert(Disease disease);
    void deleteById(Integer id);
    //void deleteByCode(String code);
    //void deleteByName(String name);
    //void deleteByICD(String icd);
    void update(Disease disease);
    Disease getDiseaseById(Integer id);
    //List<Disease> getDiseaseByCode(String code);
    //List<Disease> getDiseaseByName(String name);
    //List<Disease> getDiseaseByICD(String icd);
    //List<Disease> getDiseaseByTypeId(Integer typeId);
    List<Disease>  getAllDisease();
    
    //精确查询
    List<Disease> getDisease(Disease disease);
    //List<Disease> getAllDiseaseWithType();
}
