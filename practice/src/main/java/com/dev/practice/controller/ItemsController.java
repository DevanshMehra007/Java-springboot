package com.dev.practice.controller;

import com.dev.practice.model.Items;
import com.dev.practice.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ItemsController {
    @Autowired
    private itemService service;
    @RequestMapping("greet")
    public String greet()
    {
        return "Hello world";
    }

    @GetMapping("/items")
    public ResponseEntity<List<Items>> getAllItems()
    {
        return new ResponseEntity<>(service.getAllItems(), HttpStatus.OK);
    }
}
