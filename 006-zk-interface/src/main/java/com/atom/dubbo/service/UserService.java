package com.atom.dubbo.service;

import com.atom.dubbo.model.User;

public interface UserService {

    User queryUserById(Integer id);

    int queryAllUserCount();

    User queryUserByIdAndName(Integer id, String name);
}
