package com.example.qnavigation.controller;

import com.example.qnavigation.bean.UserBean;
import com.example.qnavigation.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String show(){
        return "login你好";
    }


//    public String login(@RequestBody UserBean userBean, @RequestParam("name") String name,@RequestParam("password") String password){
//        UserBean userB=userService.loginIn(userBean.getName(),userBean.getPassword());
//        if(userB!=null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
    @RequestMapping(value="/loginIn",method = RequestMethod.POST)
    private Map<String,Object> login(@RequestBody UserBean userBean){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.loginIn(userBean.getUsername(),userBean.getPassword()));
        return modelMap;
    }
    //查找朋友
    @RequestMapping(value="/friends",method = RequestMethod.GET)
    private Map<String,Object> findFriends( int user_id){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.queryFriends(user_id));
        return modelMap;
    }
    //更改忙态
    @RequestMapping(value = "/modifybusy",method = RequestMethod.GET)//请求参数用GET
    private Map<String,Object> modifyArea(@Param("user_id") int user_id,@Param("busy") int busy){//param与mapper对应起来
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.modifyBusy(user_id,busy));
        return modelMap;
    }
}
