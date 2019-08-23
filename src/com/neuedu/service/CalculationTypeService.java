package com.neuedu.service;
import java.util.List;

import com.neuedu.pojo.Settlecategory;


//结算类别业务接口
public interface CalculationTypeService {

    Integer insert(Settlecategory calculationType);
    void deleteById(Integer id);
    //void deleteByName(String name);
    void update(Settlecategory calculationType);
    Settlecategory getCalculationTypeById(Integer id);
    //List<CalculationType> getCalculationTypeByName(String name);
    List<Settlecategory> getAllCalculationType();
}
