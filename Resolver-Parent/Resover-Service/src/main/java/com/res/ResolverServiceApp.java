package com.res;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.res.mapper")
public class ResolverServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ResolverServiceApp.class, args);
    }
}
