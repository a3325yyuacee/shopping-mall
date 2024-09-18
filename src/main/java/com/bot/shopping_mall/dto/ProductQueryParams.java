package com.bot.shopping_mall.dto;

import com.bot.shopping_mall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory category;
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
