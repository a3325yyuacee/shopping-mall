package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.UserLoginRequest;
import com.bot.shopping_mall.dto.UserRegisterRequest;
import com.bot.shopping_mall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
