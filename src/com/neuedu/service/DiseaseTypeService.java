package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Disecategory;


//疾病类型业务接口
public interface DiseaseTypeService {

    Integer insert(Disecategory diseaseType);
    void deleteById(Integer id);
    //void deleteByCode(String code);
    //void deleteByName(String name);
    //void deleteByType(String type);
    void update(Disecategory diseaseType);
    Disecategory getDiseaseTypeById(Integer id);
    //List<DiseaseType> getDiseaseTypeByCode(String code);
    //List<DiseaseType> getDiseaseTypeByName(String name);
    //<DiseaseType> getDiseaseTypeByType(String type);
    List<Disecategory> getAllDiseaseType();
    
    //精确查询
    List<Disecategory> getDiseaseType(Disecategory diseaseType);
}
