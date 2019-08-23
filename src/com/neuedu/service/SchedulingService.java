package com.neuedu.service;

import com.neuedu.pojo.Scheduling;
import com.neuedu.pojo.Rule;

import java.util.List;



//排班规则业务接口
public interface SchedulingService {

    //Integer insertSelectiveInfo(Scheduling schedulingInfo);
    //void deleteInfoById(Integer id);
    //void deleteInfoByDoctorId(Integer doctorId);
    //void updateInfo(Integer doctorId, String weekday, String noonbreak, Rule schedulingRule);
    //Scheduling getSchedulingInfoById(Integer id);
    //List<SchedulingInfo> getSchedulingInfoByDoctorId(Integer doctorId);
    //List<SchedulingInfo> getSchedulingInfoByWeekday(String weekday);
    //List<Scheduling> getAllSchedulingInfo();

    Integer insertRule(Rule rule);
    void deleteRuleById(Integer id);
    //void deleteRuleByDoctorId(Integer doctorId);
    //void updateRule(SchedulingRule schedulingRule);
    Rule getSchedulingRuleById(Integer id);
    //List<SchedulingRule> getSchedulingRuleByDoctorId(Integer doctorId);
    //List<SchedulingRule> getSchedulingRuleByWeekday(String weekday);
    List<Rule> getAllSchedulingRule();

    //List<SchedulingInfo> getAllSchedulingInfoWithUserName();
}
