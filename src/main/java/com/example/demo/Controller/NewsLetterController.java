package com.example.demo.Controller;

import NewsLetter.Entity.Category;
import NewsLetter.Entity.RequestNewsletter;
import NewsLetter.Entity.ResponseEntity;
import NewsLetter.Service.CategoryService;
import NewsLetter.Service.NewsletterService;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Newsletter;
import com.example.demo.Entity.RequestNewsletter;
import com.example.demo.Entity.ResponseEntity;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class NewsLetterController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    NewsletterService newsletterService;

    @PutMapping("/newsletter")
    public ResponseEntity getNewsLetter(@RequestBody RequestNewsletter body, @RequestHeader String userId) throws Exception {

        List<Map<Category, List<Newsletter>>> result = newsletterService.getNewsletter(body);
        ResponseEntity re = new ResponseEntity(result);
        return re;
    }
}
