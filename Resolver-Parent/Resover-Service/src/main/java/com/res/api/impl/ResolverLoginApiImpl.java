package com.res.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.LoginInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import com.res.service.ResolverLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


/**
 * @author Shady
 */
@Service
public class ResolverLoginApiImpl implements ResolverLoginApi {

    Logger logger = LoggerFactory.getLogger(ResolverLoginApiImpl.class);

    @Resource
    ResolverLoginService resolverLoginService;

    @Override
    public ResolverResponse userLogin(LoginInfoDTO loginInfoDTO) {
        ResolverResponse resolverResponse = new ResolverResponse();
        try {
            resolverLoginService.userLogin(loginInfoDTO);
        } catch (ResolverException e) {
            resolverResponse.setReturnCode(e.getReturnCode());
            resolverResponse.setReturnMsg(e.getReturnMsg());
        } catch (Exception e){
            logger.error("登陆异常！{}",e);
        }
        return resolverResponse;
    }
}
