package com.neuedu.mapper;

import com.neuedu.pojo.Constanttype;
import com.neuedu.pojo.ConstanttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstanttypeMapper {
    long countByExample(ConstanttypeExample example);

    int deleteByExample(ConstanttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Constanttype record);

    int insertSelective(Constanttype record);

    List<Constanttype> selectByExample(ConstanttypeExample example);

    Constanttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Constanttype record, @Param("example") ConstanttypeExample example);

    int updateByExample(@Param("record") Constanttype record, @Param("example") ConstanttypeExample example);

    int updateByPrimaryKeySelective(Constanttype record);

    int updateByPrimaryKey(Constanttype record);
}