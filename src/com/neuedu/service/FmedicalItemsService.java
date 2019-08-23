package com.neuedu.service;

import java.util.List;
import com.neuedu.pojo.Fmeditem;

//非药品项目类业务接口
public interface FmedicalItemsService {

	Integer insert(Fmeditem fmedicalItems);
    //Integer insertSelective(FmedicalItems fmedicalItems);
    void deleteById(Integer id);
    //void deleteByCode(String code);
    //void deleteByName(String name);
    void update(Fmeditem fmedicalItems);
    Fmeditem getFmedicalItemsById(Integer id);
    //List<FmedicalItems> getFmedicalItemsByCode(String code);
    //List<FmedicalItems> getFmedicalItemsByName(String name);
    //List<FmedicalItems> getFmedicalItemsByDepartmentId(Integer departmentId);
    //List<FmedicalItems> getFmedicalItemsByMnemoniccode(String mnemoniccode);
    List<Fmeditem> getFmedicalItems(Fmeditem fmedicalItems);
    //List<FmedicalItems> getAllFmedicalItemsForShow();
}
