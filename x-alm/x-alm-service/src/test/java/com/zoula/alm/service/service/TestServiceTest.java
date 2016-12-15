package com.zoula.alm.service.service;

import com.zoula.alm.api.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yuxin.zou on 2016/12/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-*.xml")
public class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    public void test() {
        String res = testService.test("World");
        System.out.println(res);
    }
}
