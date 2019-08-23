package com.neuedu.mapper;

import com.neuedu.pojo.Registwork;
import com.neuedu.pojo.RegistworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistworkMapper {
    long countByExample(RegistworkExample example);

    int deleteByExample(RegistworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registwork record);

    int insertSelective(Registwork record);

    List<Registwork> selectByExample(RegistworkExample example);

    Registwork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registwork record, @Param("example") RegistworkExample example);

    int updateByExample(@Param("record") Registwork record, @Param("example") RegistworkExample example);

    int updateByPrimaryKeySelective(Registwork record);

    int updateByPrimaryKey(Registwork record);
}