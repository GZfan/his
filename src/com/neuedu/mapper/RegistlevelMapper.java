package com.neuedu.mapper;

import com.neuedu.pojo.Registlevel;
import com.neuedu.pojo.RegistlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistlevelMapper {
    long countByExample(RegistlevelExample example);

    int deleteByExample(RegistlevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registlevel record);

    int insertSelective(Registlevel record);

    List<Registlevel> selectByExample(RegistlevelExample example);

    Registlevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registlevel record, @Param("example") RegistlevelExample example);

    int updateByExample(@Param("record") Registlevel record, @Param("example") RegistlevelExample example);

    int updateByPrimaryKeySelective(Registlevel record);

    int updateByPrimaryKey(Registlevel record);
}