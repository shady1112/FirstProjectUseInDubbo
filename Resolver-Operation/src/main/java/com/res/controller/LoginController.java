package com.res.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Reference
    ResolverLoginApi resolverLoginApi;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("userlogin")
    public void  userlogin (UserInfoDTO userInfoDTO){
        resolverLoginApi.userLogin(userInfoDTO);
    }


}
