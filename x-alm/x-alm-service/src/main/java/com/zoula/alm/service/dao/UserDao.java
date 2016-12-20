package com.zoula.alm.service.dao;

import com.zoula.alm.service.model.User;

/**
 * Created by yuxin.zou on 2016/12/20.
 */
public interface UserDao {
    User selectUserById(Integer id);
}
