package com.neuedu.service;
import java.util.List;

import com.neuedu.pojo.Expenseclass;


//费用科目类业务接口
public interface ExpenseTypeService {
    Integer insertSelective(Expenseclass expenseType);
    void deleteById(Integer id);
//    void deleteByCode(String code);
//    void deleteByName(String name);
	void update(Expenseclass expenseType);
//    ExpenseType getExpenseTypeById(Integer id);
//    List<ExpenseType> getExpenseTypeByCode(String code);
//    List<ExpenseType> getExpenseTypeByName(String name);
	List<Expenseclass> getAllExpenseType();
	
	//模糊查询
	List<Expenseclass> getExpenseType(Expenseclass expenseType);
}
