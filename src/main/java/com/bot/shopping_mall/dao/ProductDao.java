package com.bot.shopping_mall.dao;

import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
