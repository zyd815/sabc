package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.ClassinfoMapper;
import com.springapp.mvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ABCDC on 2016/8/15.
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private ClassinfoMapper classinfoMapper;
    @Override
    public void sayHello() {
        System.out.println("impl say hello");
    }
}
