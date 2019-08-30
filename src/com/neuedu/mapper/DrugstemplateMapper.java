package com.neuedu.mapper;


import com.neuedu.pojo.Drugstemplate;
import com.neuedu.pojo.DrugstemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugstemplateMapper {
    long countByExample(DrugstemplateExample example);

    int deleteByExample(DrugstemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugstemplate record);

    int insertSelective(Drugstemplate record);

    List<Drugstemplate> selectByExample(DrugstemplateExample example);

    Drugstemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugstemplate record, @Param("example") DrugstemplateExample example);

    int updateByExample(@Param("record") Drugstemplate record, @Param("example") DrugstemplateExample example);

    int updateByPrimaryKeySelective(Drugstemplate record);

    int updateByPrimaryKey(Drugstemplate record);
    
    List<Drugstemplate> selectDrugstemplate(@Param("userid") Integer userid,@Param("userdept") Integer userdept);



}