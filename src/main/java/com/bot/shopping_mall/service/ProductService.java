package com.bot.shopping_mall.service;

import com.bot.shopping_mall.dto.ProductQueryParams;
import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
