package com.bot.shopping_mall.service.impl;

import com.bot.shopping_mall.dao.ProductDao;
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
}
