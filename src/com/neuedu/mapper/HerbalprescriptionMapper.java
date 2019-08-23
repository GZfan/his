package com.neuedu.mapper;

import com.neuedu.pojo.Herbalprescription;
import com.neuedu.pojo.HerbalprescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbalprescriptionMapper {
    long countByExample(HerbalprescriptionExample example);

    int deleteByExample(HerbalprescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Herbalprescription record);

    int insertSelective(Herbalprescription record);

    List<Herbalprescription> selectByExample(HerbalprescriptionExample example);

    Herbalprescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Herbalprescription record, @Param("example") HerbalprescriptionExample example);

    int updateByExample(@Param("record") Herbalprescription record, @Param("example") HerbalprescriptionExample example);

    int updateByPrimaryKeySelective(Herbalprescription record);

    int updateByPrimaryKey(Herbalprescription record);
}