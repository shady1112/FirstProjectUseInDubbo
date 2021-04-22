package com.res.service.impl;

import com.res.entity.request.LoginInfoDTO;
import com.res.exception.ResolverException;
import com.res.mapper.ResolverLoginMapper;
import com.res.service.ResolverLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ResolverLoginServiceImpl implements ResolverLoginService {
    @Resource
    ResolverLoginMapper resolverLoginMapper;

    @Override
    public void userLogin(LoginInfoDTO loginInfoDTO) {
        int isExist = resolverLoginMapper.userLogin(loginInfoDTO);
        if (isExist<1){
            throw new ResolverException("1001", "账号或密码不正确！");
        }

    }
}
