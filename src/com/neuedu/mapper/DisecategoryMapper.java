package com.neuedu.mapper;

import com.neuedu.pojo.Disecategory;
import com.neuedu.pojo.DisecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisecategoryMapper {
    long countByExample(DisecategoryExample example);

    int deleteByExample(DisecategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disecategory record);

    int insertSelective(Disecategory record);

    List<Disecategory> selectByExample(DisecategoryExample example);

    Disecategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disecategory record, @Param("example") DisecategoryExample example);

    int updateByExample(@Param("record") Disecategory record, @Param("example") DisecategoryExample example);

    int updateByPrimaryKeySelective(Disecategory record);

    int updateByPrimaryKey(Disecategory record);
}