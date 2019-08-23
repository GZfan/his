package com.neuedu.mapper;

import com.neuedu.pojo.Herbaldetailed;
import com.neuedu.pojo.HerbaldetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbaldetailedMapper {
    long countByExample(HerbaldetailedExample example);

    int deleteByExample(HerbaldetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Herbaldetailed record);

    int insertSelective(Herbaldetailed record);

    List<Herbaldetailed> selectByExample(HerbaldetailedExample example);

    Herbaldetailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Herbaldetailed record, @Param("example") HerbaldetailedExample example);

    int updateByExample(@Param("record") Herbaldetailed record, @Param("example") HerbaldetailedExample example);

    int updateByPrimaryKeySelective(Herbaldetailed record);

    int updateByPrimaryKey(Herbaldetailed record);
}