package com.neuedu.mapper;


import com.neuedu.pojo.Herbaltemplate;
import com.neuedu.pojo.HerbaltemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbaltemplateMapper {
    long countByExample(HerbaltemplateExample example);

    int deleteByExample(HerbaltemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltemplate record);

    int insertSelective(Herbaltemplate record);

    List<Herbaltemplate> selectByExample(HerbaltemplateExample example);

    Herbaltemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Herbaltemplate record, @Param("example") HerbaltemplateExample example);

    int updateByExample(@Param("record") Herbaltemplate record, @Param("example") HerbaltemplateExample example);

    int updateByPrimaryKeySelective(Herbaltemplate record);

    int updateByPrimaryKey(Herbaltemplate record);
    
    List<Herbaltemplate> selectHerbaltemplates(@Param("userid") Integer userid,@Param("userdept") Integer userdept);
}