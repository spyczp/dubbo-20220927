package com.atom.dubbo.service.impl;

import com.atom.dubbo.model.User;
import com.atom.dubbo.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return null;
    }

    @Override
    public int queryAllUserCount() {
        return 0;
    }

    @Override
    public User queryUserByIdAndName(Integer id, String name) {
        User user = new User();
        user.setId(id + 5);
        user.setName(name + "2");

        return user;
    }
}
