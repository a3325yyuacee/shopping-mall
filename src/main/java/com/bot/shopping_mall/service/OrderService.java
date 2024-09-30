package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
