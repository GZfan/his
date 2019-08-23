package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Checkapply;

public interface CheckApplyService {
	public List<Checkapply> listCheckApply();

    public void addCheckApply(Checkapply checkapply);  
    
    
    public void deleteCheckApply(int id);  
       
      
    public Checkapply getCheckapply(Integer id);  
     
      
    public void updateCheckApply(Checkapply checkapply); 
}
