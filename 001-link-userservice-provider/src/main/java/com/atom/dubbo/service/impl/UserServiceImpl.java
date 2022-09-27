package com.atom.dubbo.service.impl;

import com.atom.dubbo.model.User;
import com.atom.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAddress("广州");

        return user;
    }
}
