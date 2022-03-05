package com.example.qnavigation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.qnavigation.dao")
public class QnavigationApplication {

    public static void main(String[] args) {
        SpringApplication.run(QnavigationApplication.class, args);
    }
    
}
