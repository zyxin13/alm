package com.zoula.alm.service.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zoula.alm.api.TestService;
import com.zoula.alm.service.dao.UserDao;
import com.zoula.alm.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yuxin.zou on 2016/12/12.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDao userDao;

    public String test(String testText) {
        User user = userDao.selectUserById(Integer.valueOf(testText));
        return "Hello," + user.getNickname();
    }
}
