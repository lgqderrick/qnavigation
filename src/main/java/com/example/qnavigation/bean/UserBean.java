package com.example.qnavigation.bean;

import javax.annotation.Resource;

public class UserBean {

    int user_id;
    String username;
    String password;
    String nickName;
    int busy;//忙态
    String phone;//电话

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }

    public int getBusy() {
        return busy;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUsername() {
        return username;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }
}
