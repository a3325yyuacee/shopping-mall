package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.CreateOrderRequest;
import com.bot.shopping_mall.dto.OrderQueryParams;
import com.bot.shopping_mall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
