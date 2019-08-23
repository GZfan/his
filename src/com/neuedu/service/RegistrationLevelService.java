package com.neuedu.service;
import java.util.List;
import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.RegistlevelExample;

//挂号级别类业务接口
public interface RegistrationLevelService {
    Integer insert(Registlevel registrationLevel);
    void deleteById(Integer id);
    //void deleteByName(String name);
    void update(Registlevel registrationLevel);
    Registlevel getRegistrationLevelById(Integer id);
   // List<RegistrationLevel> getRegistrationLevelByName(String name);
    //List<RegistrationLevel> getRegistrationLevelByIsDefault(String isDefault);
    List<Registlevel> getAllRegistrationLevel();
}
