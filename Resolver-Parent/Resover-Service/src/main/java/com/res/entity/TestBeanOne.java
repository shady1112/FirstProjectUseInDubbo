package com.res.entity;

import java.util.List;

public class TestBeanOne {

    private List<TestBeanTwo> beanTwoList;

    public List<TestBeanTwo> getBeanTwoList() {
        return beanTwoList;
    }

    public void setBeanTwoList(List<TestBeanTwo> beanTwoList) {
        this.beanTwoList = beanTwoList;
    }
}
