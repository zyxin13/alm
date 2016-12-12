package com.zoula.alm.web.controller;

import com.zoula.alm.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuxin.zou on 2016/12/9.
 */
@RestController
@EnableAutoConfiguration
public class HelloworldController {
    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        return testService.test("hello,Spring boot!");
//        return "hello,Spring boot!";
    }

    //带参数
    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name) {
        return "word--spring boot:" + name;
    }
}
