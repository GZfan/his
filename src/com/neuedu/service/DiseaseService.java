package com.neuedu.service;

import com.neuedu.pojo.*;
import java.util.List;


//疾病业务接口
public interface DiseaseService {

    Integer insert(Disease disease);
    
    void deleteById(Integer id);
    
    void deleteByIds(List<Integer> ids);
    
    void update(Disease disease);
    
    Disease getDiseaseById(Integer id);
   
    List<Disease>  getAllDisease();
    
    List<Disease> getDisease(String name);
    
}
