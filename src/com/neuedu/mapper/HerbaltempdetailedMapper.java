package com.neuedu.mapper;

import com.neuedu.pojo.Herbaltempdetailed;
import com.neuedu.pojo.HerbaltempdetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbaltempdetailedMapper {
    long countByExample(HerbaltempdetailedExample example);

    int deleteByExample(HerbaltempdetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltempdetailed record);

    int insertSelective(Herbaltempdetailed record);

    List<Herbaltempdetailed> selectByExample(HerbaltempdetailedExample example);

    Herbaltempdetailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Herbaltempdetailed record, @Param("example") HerbaltempdetailedExample example);

    int updateByExample(@Param("record") Herbaltempdetailed record, @Param("example") HerbaltempdetailedExample example);

    int updateByPrimaryKeySelective(Herbaltempdetailed record);

    int updateByPrimaryKey(Herbaltempdetailed record);
}