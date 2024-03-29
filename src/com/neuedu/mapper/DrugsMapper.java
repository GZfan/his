package com.neuedu.mapper;

import com.neuedu.pojo.Drugs;
import com.neuedu.pojo.DrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsMapper {
    long countByExample(DrugsExample example);

    int deleteByExample(DrugsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    List<Drugs> selectByExample(DrugsExample example);

    Drugs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByExample(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
    
    List<Drugs> selectDrugsToBeDistributed(@Param("registID") Integer registID);
}