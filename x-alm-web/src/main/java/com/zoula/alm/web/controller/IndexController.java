package com.zoula.alm.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yuxin.zou on 2016/12/16.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
