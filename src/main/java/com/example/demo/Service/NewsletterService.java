package com.example.demo.Service;

import NewsLetter.Entity.Category;
import NewsLetter.Entity.Newsletter;
import NewsLetter.Entity.RequestNewsletter;
import NewsLetter.Repository.NewsletterRepository;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Newsletter;
import com.example.demo.Entity.RequestNewsletter;
import com.example.demo.Repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsletterService {

    @Autowired
    NewsletterRepository newsletterRepository;


    public List<Map<Category, List<Newsletter>>> getNewsletter(RequestNewsletter request) throws Exception {

        if(request == null)
            throw new Exception("Empty Reqest received");

        List<Map<Category, List<Newsletter>>> resultmap = new ArrayList<>();

        for(Category category: request.getCategories()){
            Map<Category, List<Newsletter>> map = new HashMap<>();
            map.put(category, newsletterRepository.getNewsLetterByCategory(category.getCategoryId()));
            resultmap.add(map);
        }
        return resultmap;
    }

}
