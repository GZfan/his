package com.neuedu.mapper;

import com.neuedu.pojo.Checkapply;
import com.neuedu.pojo.CheckapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckapplyMapper {
    long countByExample(CheckapplyExample example);

    int deleteByExample(CheckapplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkapply record);

    int insertSelective(Checkapply record);

    List<Checkapply> selectByExample(CheckapplyExample example);

    Checkapply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkapply record, @Param("example") CheckapplyExample example);

    int updateByExample(@Param("record") Checkapply record, @Param("example") CheckapplyExample example);

    int updateByPrimaryKeySelective(Checkapply record);

    int updateByPrimaryKey(Checkapply record);
}