package com.it;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.it.mapper")
public class RecruitmentApplication {
    //注册 http://localhost:8081/register
    //登录 http://localhost:8081/login
    //主页 http://localhost:8081/
    public static void main(String[] args) {
        SpringApplication.run(RecruitmentApplication.class, args);
    }

}
