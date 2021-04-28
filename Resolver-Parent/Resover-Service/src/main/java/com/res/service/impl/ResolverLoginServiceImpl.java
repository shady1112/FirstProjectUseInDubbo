package com.res.service.impl;

import com.res.entity.TestBeanOne;
import com.res.entity.TestBeanThree;
import com.res.entity.TestBeanTwo;
import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;
import com.res.exception.ResolverException;
import com.res.mapper.ResolverLoginMapper;
import com.res.service.ResolverLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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


    public static void main(String[] args) {
        TestBeanThree testBeanThree1 = new TestBeanThree();
        testBeanThree1.setId("1");
        TestBeanThree testBeanThree2 = new TestBeanThree();
        testBeanThree2.setId("2");
        TestBeanThree testBeanThree3 = new TestBeanThree();
        testBeanThree3.setId("3");
        List<TestBeanThree> objects = new ArrayList<>();
        objects.add(testBeanThree1);
        objects.add(testBeanThree2);
        objects.add(testBeanThree3);


        TestBeanTwo testBeanTwo = new TestBeanTwo();
        testBeanTwo.setBeanThreeList(objects);

        TestBeanTwo testBeanTwo2 = new TestBeanTwo();
        testBeanTwo2.setBeanThreeList(objects);

        List<TestBeanTwo> objects2 = new ArrayList<>();
        objects2.add(testBeanTwo);
        objects2.add(testBeanTwo2);

        TestBeanOne testBeanOne = new TestBeanOne();
        testBeanOne.setBeanTwoList(objects2);

        List<TestBeanOne> objects1 = new ArrayList<>();
        objects1.add(testBeanOne);

        Iterator<TestBeanOne> iterator = objects1.iterator();


        while (iterator.hasNext()) {
            TestBeanOne next = iterator.next();
            Iterator<TestBeanTwo> iterator1 = next.getBeanTwoList().iterator();
            while (iterator1.hasNext()) {
                TestBeanTwo next1 = iterator1.next();
                List<TestBeanThree> beanThreeList = next1.getBeanThreeList();
                Iterator<TestBeanThree> iterator2 = beanThreeList.iterator();
                while (iterator2.hasNext()) {
                    TestBeanThree next2 = iterator2.next();
                    if ("1".equals(next2.getId())) {
                        iterator2.remove();
                    }
                }
            }
            List arrayList = new ArrayList<>(iterator1);
            if(arrayList.size() == 0){
                iterator.remove();
            }
        }

    }




}
