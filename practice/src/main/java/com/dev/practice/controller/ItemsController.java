package com.dev.practice.controller;

import com.dev.practice.model.Items;
import com.dev.practice.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/items/{id}")
    public ResponseEntity<Items> getProduct(@PathVariable int id)
    {
        Items item=service.getItemsById(id);
        if(item !=null)
        {
            return new ResponseEntity<>(item, HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
