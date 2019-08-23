package com.neuedu.mapper;

import com.neuedu.pojo.Patientcosts;
import com.neuedu.pojo.PatientcostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientcostsMapper {
    long countByExample(PatientcostsExample example);

    int deleteByExample(PatientcostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patientcosts record);

    int insertSelective(Patientcosts record);

    List<Patientcosts> selectByExample(PatientcostsExample example);

    Patientcosts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patientcosts record, @Param("example") PatientcostsExample example);

    int updateByExample(@Param("record") Patientcosts record, @Param("example") PatientcostsExample example);

    int updateByPrimaryKeySelective(Patientcosts record);

    int updateByPrimaryKey(Patientcosts record);
}