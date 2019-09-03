package com.neuedu.service;
import java.util.List;

import com.neuedu.pojo.Expenseclass;


//费用科目类业务接口
public interface ExpenseTypeService {
    void insertSelective(Expenseclass expenseType);
    
    void deleteById(Integer id);

	void update(Expenseclass expenseType);

	List<Expenseclass> getAllExpenseType();
	
	//模糊查询
	List<Expenseclass> getExpenseType(Expenseclass expenseType);
}
