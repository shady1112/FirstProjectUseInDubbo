package com.res.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.res.annotation.GlobalErrorHandler;
import com.res.api.ResolverLoginApi;
import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import com.res.service.ResolverLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
    public ResolverResponse userLogin(UserInfoDTO userInfoDTO) {
        ResolverResponse resolverResponse = new ResolverResponse();
        try {
            resolverLoginService.userLogin(userInfoDTO);
        } catch (ResolverException e) {
            resolverResponse.setReturnCode(e.getReturnCode());
            resolverResponse.setReturnMsg(e.getReturnMsg());
        } catch (Exception e){
            logger.error("登陆异常！{}",e);
        }
        return resolverResponse;
    }
}
