package com.res.aspect;


import com.res.annotation.GlobalErrorHandler;
import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class GlobalErrorHandlerAspect {

    Logger logger = LoggerFactory.getLogger(GlobalErrorHandler.class);
    @Pointcut("@annotation(com.res.annotation.GlobalErrorHandler)")
    public void performance() {

    }

    @Around("performance()")
    public Object doAround(ProceedingJoinPoint pjd) {
        ResolverResponse resolverResponse = new ResolverResponse();
        Class<?> aClass = pjd.getTarget().getClass();
        Method method = ((MethodSignature) pjd.getSignature()).getMethod();
        Object result = null;
        try {
            result = (ResolverResponse) pjd.proceed();
        } catch (Throwable e) {
            logger.error("方法名称；["+method+"] 异常 : {}",e);
            if (e.getClass().getSimpleName().equals("ResolverException")){
                ResolverException resolverException = (ResolverException) e;
                resolverResponse.setReturnCode(((ResolverException) e).getReturnCode());
                resolverResponse.setReturnMsg(((ResolverException) e).getReturnMsg());
            }else {
                resolverResponse.setReturnCode("9999");
                resolverResponse.setReturnMsg(e.getMessage());
            }
            Object arg = pjd.getArgs()[0];

            return resolverResponse;
        }
        return resolverResponse;
    }


}
