package com.res;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ResolverSericeApp {
    public static void main(String[] args) {
        SpringApplication.run(ResolverSericeApp.class, args);
    }
}
