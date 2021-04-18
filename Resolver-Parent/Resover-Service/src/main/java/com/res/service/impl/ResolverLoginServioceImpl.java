package com.res.service.impl;

import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import com.res.service.ResolverLoginServioce;
import org.springframework.stereotype.Service;


@Service
public class ResolverLoginServioceImpl implements ResolverLoginServioce {

    @Override
    public void userLogin(ResolverResponse resolverResponse) {

        System.out.println("aaaaaaaaaaaaaaaa");

        throw new ResolverException("9995", "aaaaaa");
    }
}
