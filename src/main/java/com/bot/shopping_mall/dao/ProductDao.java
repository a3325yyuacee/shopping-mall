package com.bot.shopping_mall.dao;

import com.bot.shopping_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
