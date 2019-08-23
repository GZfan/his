package com.neuedu.mapper;

import com.neuedu.pojo.Medicaldisease;
import com.neuedu.pojo.MedicaldiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicaldiseaseMapper {
    long countByExample(MedicaldiseaseExample example);

    int deleteByExample(MedicaldiseaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicaldisease record);

    int insertSelective(Medicaldisease record);

    List<Medicaldisease> selectByExample(MedicaldiseaseExample example);

    Medicaldisease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicaldisease record, @Param("example") MedicaldiseaseExample example);

    int updateByExample(@Param("record") Medicaldisease record, @Param("example") MedicaldiseaseExample example);

    int updateByPrimaryKeySelective(Medicaldisease record);

    int updateByPrimaryKey(Medicaldisease record);
}