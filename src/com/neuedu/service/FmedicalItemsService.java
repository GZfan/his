package com.neuedu.service;

import java.util.List;
import com.neuedu.pojo.Fmeditem;

//非药品项目类业务接口
public interface FmedicalItemsService {

	Integer insert(Fmeditem fmedicalItems);
   
    void deleteById(Integer id);
   
    void update(Fmeditem fmedicalItems);
    
    Fmeditem getFmedicalItemsById(Integer id);
   
    List<Fmeditem> getFmedicalItems(Fmeditem fmedicalItems);
    
    void deleteByList(List<Integer> list);
   
}
