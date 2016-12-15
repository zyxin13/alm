package com.zoula.alm.service.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zoula.alm.api.TestService;

/**
 * Created by yuxin.zou on 2016/12/12.
 */
@Service
public class TestServiceImpl implements TestService {

    public String test(String testText) {
        System.out.println(testText);
        return "Hello," + testText;
    }
}
