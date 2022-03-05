package com.example.qnavigation.service;

import com.example.qnavigation.bean.UserBean;

import java.util.List;

public interface UserService {

    UserBean loginIn(String name, String password);

    List<UserBean> queryFriends(int user_id);

    boolean modifyBusy(int user_id,int busy);
}
