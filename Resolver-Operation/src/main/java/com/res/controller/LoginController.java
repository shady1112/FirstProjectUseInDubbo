package com.res.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.utils.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @RequestMapping("userlogin")
    public ResolverResponse  userlogin (UserInfoDTO userInfoDTO){
        ResolverResponse resolverResponse = new ResolverResponse();
        //查询缓存中是否在该ID
        String loginName = (String) redisUtil.get(userInfoDTO.getLoginName());
        if (StringUtils.isNoneBlank(loginName)){
            return resolverResponse;
        }
         resolverResponse = resolverLoginApi.userLogin(userInfoDTO);
        if (resolverResponse.getReturnCode().equals("0000")){
            redisUtil.set( userInfoDTO.getLoginName(),"loginName", 30L, TimeUnit.MINUTES);
        }
        return resolverResponse ;

    }


}
