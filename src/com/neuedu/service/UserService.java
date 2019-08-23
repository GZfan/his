package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.User;
import com.neuedu.util.Page;


//用户类业务接口
public interface UserService {

    Integer insert(User user);
    void deleteById(Integer id);
    //void deleteByLoginname(String loginname);
    //void deleteByUserName(String userName);
    void update(User user);
    User getUserById(Integer id);
    //List<User> getUserByLoginname(String loginname);
    //List<User> getUserByUserName(String userName);
    //List<User> getUserByRoleId(Integer roleId);
    //List<User> getUserByUserTitleId(Integer userTitleId);
    //List<User> getUserByUserGender(String userGender);
    List<User> getAllUser();
    //List<User> getUserByDepartmentID(int departmentID);
    //List<User> getUserByRole(Integer roleId);
    //List<User> getAllUserWithRole();
}
