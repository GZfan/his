package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.neuedu.util.ResultDTO;
import com.neuedu.pojo.Expenseclass;
import com.neuedu.service.ExpenseTypeService;

@Controller
@RequestMapping("/expensetype")
public class ExpenseTypeController {
	@Autowired
    ExpenseTypeService expenseTypeService;
	
	//插入费用科目
	@ResponseBody
	@RequestMapping("/insert")
	public ResultDTO<Expenseclass> insert(@RequestBody Expenseclass expenseType){
	    ResultDTO resultDTO = new ResultDTO();
	    try {
	    	expenseTypeService.insertSelective(expenseType);
	        resultDTO.setData(expenseType);
	        resultDTO.setStatus("OK");
	        resultDTO.setMsg("插入费用科目成功！");
	    } catch (Exception e) {
	        e.printStackTrace();
	        resultDTO.setStatus("ERROR");
	        resultDTO.setMsg("插入费用科目失败！");
	    }
	    return resultDTO;
	}
	
	//删除费用科目
	@ResponseBody
	@RequestMapping("/delete")
    public ResultDTO<Expenseclass> delete(Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            expenseTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除费用科目失败！");
        }
        return resultDTO;
    }
	
	
	//更新费用科目
	@ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Expenseclass> update(@RequestBody Expenseclass expenseType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            expenseTypeService.update(expenseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新费用科目失败！");
        }
        return resultDTO;
    }
	
	//获取所有费用科目
	@ResponseBody
    @RequestMapping("/getallexpensetype")
    public ResultDTO<Expenseclass> getAllExpenseType(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(expenseTypeService.getAllExpenseType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示费用科目失败！");
        }
        return resultDTO;
    }
	
	
	//模糊查询费用科目
	@ResponseBody
    @RequestMapping("/getexpensetype")
    public ResultDTO<Expenseclass> getExpenseTypeById(@RequestBody Expenseclass expenseType){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(expenseTypeService.getExpenseType(expenseType));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询费用科目失败！");
        }
        return resultDTO;
    }	
	
	

}
