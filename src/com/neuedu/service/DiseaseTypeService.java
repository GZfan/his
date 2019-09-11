package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Disecategory;


//疾病类型业务接口
public interface DiseaseTypeService {

    Integer insert(Disecategory diseaseType);
    
    void deleteById(Integer id);
   
    void update(Disecategory diseaseType);
    
    Disecategory getDiseaseTypeById(Integer id);
   
    List<Disecategory> getAllDiseaseType();
    
    //模糊查询
    List<Disecategory> getDiseaseType(String name);
    
    void deleteByIds(List<Integer> ids);
    
    
}