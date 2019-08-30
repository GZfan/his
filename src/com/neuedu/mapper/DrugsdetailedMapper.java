package com.neuedu.mapper;

import com.neuedu.pojo.DrugsDetailedAndDrug;
import com.neuedu.pojo.Drugsdetailed;
import com.neuedu.pojo.DrugsdetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsdetailedMapper {
    long countByExample(DrugsdetailedExample example);

    int deleteByExample(DrugsdetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugsdetailed record);

    int insertSelective(Drugsdetailed record);

    List<Drugsdetailed> selectByExample(DrugsdetailedExample example);

    Drugsdetailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugsdetailed record, @Param("example") DrugsdetailedExample example);

    int updateByExample(@Param("record") Drugsdetailed record, @Param("example") DrugsdetailedExample example);

    int updateByPrimaryKeySelective(Drugsdetailed record);

    int updateByPrimaryKey(Drugsdetailed record);
    
    public List<DrugsDetailedAndDrug> selectDrugsDetailedAndDrug(@Param("drugsTempID") int drugsTempID);
}