package com.neuedu.mapper;

import com.neuedu.pojo.Fmeditem;
import com.neuedu.pojo.FmeditemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmeditemMapper {
    long countByExample(FmeditemExample example);

    int deleteByExample(FmeditemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fmeditem record);

    int insertSelective(Fmeditem record);

    List<Fmeditem> selectByExample(FmeditemExample example);

    Fmeditem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fmeditem record, @Param("example") FmeditemExample example);

    int updateByExample(@Param("record") Fmeditem record, @Param("example") FmeditemExample example);

    int updateByPrimaryKeySelective(Fmeditem record);

    int updateByPrimaryKey(Fmeditem record);
    
    List<Fmeditem> selectFmeditems(@Param("checkTempID") Integer checkTempID);
}