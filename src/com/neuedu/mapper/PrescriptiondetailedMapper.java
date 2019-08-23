package com.neuedu.mapper;

import com.neuedu.pojo.Prescriptiondetailed;
import com.neuedu.pojo.PrescriptiondetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptiondetailedMapper {
    long countByExample(PrescriptiondetailedExample example);

    int deleteByExample(PrescriptiondetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Prescriptiondetailed record);

    int insertSelective(Prescriptiondetailed record);

    List<Prescriptiondetailed> selectByExample(PrescriptiondetailedExample example);

    Prescriptiondetailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Prescriptiondetailed record, @Param("example") PrescriptiondetailedExample example);

    int updateByExample(@Param("record") Prescriptiondetailed record, @Param("example") PrescriptiondetailedExample example);

    int updateByPrimaryKeySelective(Prescriptiondetailed record);

    int updateByPrimaryKey(Prescriptiondetailed record);
}