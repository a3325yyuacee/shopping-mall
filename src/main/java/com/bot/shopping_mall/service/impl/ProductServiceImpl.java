package com.bot.shopping_mall.service.impl;

import com.bot.shopping_mall.dao.ProductDao;
import com.bot.shopping_mall.dto.ProductRequest;
import com.bot.shopping_mall.model.Product;
import com.bot.shopping_mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {

        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {

         productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {

        productDao.deleteProductById(productId);
    }
}
