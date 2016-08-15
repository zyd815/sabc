package com.springapp.mvc.service.impl;

import com.springapp.mvc.service.TestService;

/**
 * Created by ABCDC on 2016/8/15.
 */
public class TestServiceImpl implements TestService{
    @Override
    public void sayHello() {
        System.out.println("impl say hello");
    }
}
