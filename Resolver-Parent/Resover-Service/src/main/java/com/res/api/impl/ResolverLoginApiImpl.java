package com.res.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.res.annotation.GlobalErrorHandler;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.service.ResolverLoginServioce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @author Shady
 */
@Service
public class ResolverLoginApiImpl implements ResolverLoginApi {

    Logger logger = LoggerFactory.getLogger(ResolverLoginApiImpl.class);

    @Autowired
    ResolverLoginServioce resolverLoginService;

    @Override
    @GlobalErrorHandler
    public ResolverResponse userLogin(UserInfoDTO userInfoDTO) {
        resolverLoginService.testlogin();
    }
}
