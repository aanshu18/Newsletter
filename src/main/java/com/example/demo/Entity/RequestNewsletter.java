package com.example.demo.Entity;

import java.io.Serializable;
import java.util.List;

public class RequestNewsletter implements Serializable {

    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public RequestNewsletter(List<Category> categories) {
        this.categories = categories;
    }
}
