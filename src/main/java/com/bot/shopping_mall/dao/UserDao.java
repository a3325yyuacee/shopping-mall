package com.bot.shopping_mall.dao;

import com.bot.shopping_mall.dto.UserRegisterRequest;
import com.bot.shopping_mall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
