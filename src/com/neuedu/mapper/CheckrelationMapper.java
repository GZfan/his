package com.neuedu.mapper;

import com.neuedu.pojo.Checkrelation;
import com.neuedu.pojo.CheckrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckrelationMapper {
    long countByExample(CheckrelationExample example);

    int deleteByExample(CheckrelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkrelation record);

    int insertSelective(Checkrelation record);

    List<Checkrelation> selectByExample(CheckrelationExample example);

    Checkrelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkrelation record, @Param("example") CheckrelationExample example);

    int updateByExample(@Param("record") Checkrelation record, @Param("example") CheckrelationExample example);

    int updateByPrimaryKeySelective(Checkrelation record);

    int updateByPrimaryKey(Checkrelation record);
}