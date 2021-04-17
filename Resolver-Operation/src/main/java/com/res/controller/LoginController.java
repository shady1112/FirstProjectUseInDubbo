package com.res.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.res.api.ResolverLoginApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aa")
public class LoginController {

    @Reference
    ResolverLoginApi resolverLoginApi;


    @RequestMapping("dd")
    public void  aaa (){
        resolverLoginApi.testlogin();
    }


}
