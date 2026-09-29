package com.dev.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
    @RequestMapping("greet")
    public String greet()
    {
        return "Hello world";
    }
}
