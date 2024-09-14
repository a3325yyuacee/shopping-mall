package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
