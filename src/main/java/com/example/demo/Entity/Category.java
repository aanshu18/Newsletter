package com.example.demo.Entity;

import com.sun.istack.internal.NotNull;

public class Category {

    private final String categoryName;
    private final String categoryId;

    private String categoryInfo;

    public Category(@NotNull  String categoryName,@NotNull String categoryId, String categoryInfo) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.categoryInfo = categoryInfo;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(String categoryInfo) {
        this.categoryInfo = categoryInfo;
    }
}
