package com.res.service.impl;

import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import com.res.mapper.ResolverLoginMapper;
import com.res.service.ResolverLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ResolverLoginServiceImpl implements ResolverLoginService {
    @Resource
    ResolverLoginMapper resolverLoginMapper;

    @Override
    public void userLogin(UserInfoDTO userInfoDTO) {
        int isExist = resolverLoginMapper.userLogin(userInfoDTO);
        if (isExist<1){
            throw new ResolverException("1001", "账号或密码不正确！");
        }

    }
}
