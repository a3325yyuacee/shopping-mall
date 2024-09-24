package com.bot.shopping_mall.service.impl;

import com.bot.shopping_mall.dao.UserDao;
import com.bot.shopping_mall.dto.UserRegisterRequest;
import com.bot.shopping_mall.model.User;
import com.bot.shopping_mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        return userDao.createUser(userRegisterRequest);
    }
}
