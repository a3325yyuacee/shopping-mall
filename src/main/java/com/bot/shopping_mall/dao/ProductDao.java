package com.bot.shopping_mall.dao;

import com.bot.shopping_mall.constant.ProductCategory;
import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
