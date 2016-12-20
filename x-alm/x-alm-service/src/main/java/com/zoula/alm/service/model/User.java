package com.zoula.alm.service.model;

import java.io.Serializable;

/**
 * Created by yuxin.zou on 2016/12/20.
 */

public class User implements Serializable{
    private Integer id;
    private String username;
    private String nickname;
    private String password;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", nickname=" + nickname
                + ", password=" + password + ", email=" + email + "]";
    }
}
