package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.CreateOrderRequest;
import com.bot.shopping_mall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
