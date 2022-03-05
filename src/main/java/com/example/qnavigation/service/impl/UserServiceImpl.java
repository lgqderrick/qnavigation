package com.example.qnavigation.service.impl;

import com.example.qnavigation.bean.UserBean;
import com.example.qnavigation.dao.UserMapper;
import com.example.qnavigation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {

        return userMapper.getInfo(name,password);
    }

    @Override
    public List<UserBean> queryFriends(int user_id) {
        return userMapper.queryAllUserExId(user_id);
    }

    @Override
    public boolean modifyBusy(int user_id, int busy) {
        int affectedNum=userMapper.updateBusy(user_id,busy);

        if(affectedNum>0)
            return true;
        return false;
    }
}
