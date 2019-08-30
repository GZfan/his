package com.neuedu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.Register;

//医技工作站业务接口
public interface TechService {

    //更新患者在该科室的登记状态，该科室的1->2
    void updateRegistrationStatus(Integer CheckapplyId);

    //输出该患者在该科室的全部项目
    List<Checkapply> getAllFmedical(Integer Medical_record_ID);

    //检查检验结果录入,并更改患者在科室的登记状态
    void updateCheckapply(Checkapply checkapply);

    
    public List<Register> getRegister(String name,String casenumber);
    
    
    //获得已经交费的检查申请
    public List<CheckPack> getCheckPacks( Integer registID, Integer recordType);
    
    

}
