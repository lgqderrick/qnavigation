package com.example.qnavigation;

import com.example.qnavigation.bean.UserBean;
import com.example.qnavigation.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.qnavigation.dao")
class QnavigationApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
//         UserBean bl=userService.loginIn("a","a");
//       List<UserBean> list=userService.queryFriends(1);
//       System.out.println("----------------00000--------------"+list);
//        System.out.println(bl.getUser_id()+"id---------------------------------");
        Map<Integer, Integer> m=new HashMap<>();
        m.put(1,2);
        m.put(1,3);
        System.out.println("1是 :"+m.get(1));
    }

}
