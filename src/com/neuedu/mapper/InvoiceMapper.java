package com.neuedu.mapper;

import com.neuedu.pojo.Invoice;
import com.neuedu.pojo.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceMapper {
    long countByExample(InvoiceExample example);

    int deleteByExample(InvoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    List<Invoice> selectByExample(InvoiceExample example);

    Invoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}