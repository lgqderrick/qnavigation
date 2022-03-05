package com.example.qnavigation.dao;

import com.example.qnavigation.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
    UserBean getInfo(String name,String password);
    List<UserBean> queryAllUserExId(int user_id);
    int updateBusy(int user_id,int busy);
}
