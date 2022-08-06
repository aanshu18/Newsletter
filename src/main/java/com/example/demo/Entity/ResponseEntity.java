package com.example.demo.Entity;

import java.util.List;
import java.util.Map;

public class ResponseEntity {
    private List<Map<Category, List<Newsletter>>> response;

    public List<Map<Category, List<Newsletter>>> getResponse() {
        return response;
    }

    public void setResponse(List<Map<Category, List<Newsletter>>> response) {
        this.response = response;
    }

    public ResponseEntity(List<Map<Category, List<Newsletter>>> response) {
        this.response = response;
    }
}
