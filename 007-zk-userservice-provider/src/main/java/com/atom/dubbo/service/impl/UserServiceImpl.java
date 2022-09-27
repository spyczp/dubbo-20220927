package com.atom.dubbo.service.impl;

import com.atom.dubbo.model.User;
import com.atom.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("王五");

        return user;
    }

    @Override
    public int queryAllUserCount() {
        return 199;
    }

    @Override
    public User queryUserByIdAndName(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }
}
