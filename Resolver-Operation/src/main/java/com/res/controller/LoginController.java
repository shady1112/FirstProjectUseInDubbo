package com.res.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.LoginInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.utils.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("login")
public class LoginController {

    @Reference
    ResolverLoginApi resolverLoginApi;

    @Autowired
    RedisUtil redisUtil;

    @Validated
    @RequestMapping("userLogin")
    public ResolverResponse  userlogin (LoginInfoDTO loginInfoDTO){
        ResolverResponse resolverResponse = new ResolverResponse();
        //账号存在，密码不存在 ，自动登录
        if (StringUtils.isNotBlank(loginInfoDTO.getAccount())&&StringUtils.isBlank(loginInfoDTO.getPassword())) {
            String loginName = (String) redisUtil.get(loginInfoDTO.getAccount());
            if (StringUtils.isNotBlank(loginName)) {
                return resolverResponse;
            } else {
                resolverResponse.setReturnCode("1002");
                resolverResponse.setReturnMsg("登录已过期，请重新登录！");
            }
        }
         resolverResponse = resolverLoginApi.userLogin(loginInfoDTO);
        if (resolverResponse.getReturnCode().equals("0000")){
            redisUtil.set( loginInfoDTO.getAccount(),"loginName", 30L, TimeUnit.MINUTES);
        }
        return resolverResponse ;
    }


    @RequestMapping("userRegistry")
    public ResolverResponse userRegistry(){

        return null;


    }
}
