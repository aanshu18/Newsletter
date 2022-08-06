package com.example.demo.Repository;

import NewsLetter.Entity.Category;
import NewsLetter.Entity.Newsletter;
import NewsLetter.Entity.User;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Newsletter;
import com.example.demo.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class NewsletterRepository {
    private List<User> users;
    private List<Category> categories;
    private List<Newsletter> newsletter;

    public NewsletterRepository(List<User> users, List<Category> categories, List<Newsletter> newsletter) {
        this.users = users;
        this.categories = categories;
        this.newsletter = newsletter;
    }

    public List<Newsletter> getNewsLetterByCategory(String categoryId){
        List<Newsletter> resultList = new ArrayList<>();

        for(Newsletter nl : newsletter){
            if(newsletter.getCategory().getCategoryid() == categoryId)
                resultList.add(nl);
        }
        return resultList;
    }
}
