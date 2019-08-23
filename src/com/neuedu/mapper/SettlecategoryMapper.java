package com.neuedu.mapper;

import com.neuedu.pojo.Settlecategory;
import com.neuedu.pojo.SettlecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettlecategoryMapper {
    long countByExample(SettlecategoryExample example);

    int deleteByExample(SettlecategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Settlecategory record);

    int insertSelective(Settlecategory record);

    List<Settlecategory> selectByExample(SettlecategoryExample example);

    Settlecategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Settlecategory record, @Param("example") SettlecategoryExample example);

    int updateByExample(@Param("record") Settlecategory record, @Param("example") SettlecategoryExample example);

    int updateByPrimaryKeySelective(Settlecategory record);

    int updateByPrimaryKey(Settlecategory record);
}