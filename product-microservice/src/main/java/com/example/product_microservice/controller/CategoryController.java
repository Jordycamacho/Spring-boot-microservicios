package com.example.product_microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
@RefreshScope
public class CategoryController {
    
    @Value("${app.testProp}")
    private String testPro;

    @GetMapping("test-prop")
    public String getTestProp(){
        return this.testPro;
    }
}
