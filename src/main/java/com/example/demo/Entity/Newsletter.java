package com.example.demo.Entity;

import com.sun.istack.internal.NotNull;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class
Newsletter {
    private final String id;
    private final double price;
    private final String title;
    private List<Category> categories;

    private String content;

    public Newsletter(@NotNull  String id,@NotNull double price, String title, List<Category> categories, String content) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.categories = new ArrayList<>();
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addCategory(String categoryId){
        Category category = categoryService.getCategory(categoryId);
        if(category != null){
            this.categories.add(category);
        }
    }

}
