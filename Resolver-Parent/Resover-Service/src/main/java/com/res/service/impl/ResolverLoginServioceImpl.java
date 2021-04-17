package com.res.service.impl;

import com.res.exception.ResolverException;
import com.res.service.ResolverLoginServioce;
import org.springframework.stereotype.Service;


@Service
public class ResolverLoginServioceImpl implements ResolverLoginServioce {

    @Override
    public void testlogin() {
        System.out.println("aaaaaaaaaaaaaaaa");
        throw new ResolverException("9995", "aaaaaa");
    }
}
