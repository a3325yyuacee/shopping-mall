package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
