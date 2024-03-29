package com.neuedu.mapper;

import com.neuedu.pojo.Constantitem;
import com.neuedu.pojo.ConstantitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstantitemMapper {
    long countByExample(ConstantitemExample example);

    int deleteByExample(ConstantitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    List<Constantitem> selectByExample(ConstantitemExample example);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Constantitem record, @Param("example") ConstantitemExample example);

    int updateByExample(@Param("record") Constantitem record, @Param("example") ConstantitemExample example);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);
}