package com.neuedu.mapper;

import com.neuedu.pojo.Expenseclass;
import com.neuedu.pojo.ExpenseclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseclassMapper {
    long countByExample(ExpenseclassExample example);

    int deleteByExample(ExpenseclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Expenseclass record);

    int insertSelective(Expenseclass record);

    List<Expenseclass> selectByExample(ExpenseclassExample example);

    Expenseclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Expenseclass record, @Param("example") ExpenseclassExample example);

    int updateByExample(@Param("record") Expenseclass record, @Param("example") ExpenseclassExample example);

    int updateByPrimaryKeySelective(Expenseclass record);

    int updateByPrimaryKey(Expenseclass record);
}