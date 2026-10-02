package com.dev.practice.service;

import com.dev.practice.model.Items;
import com.dev.practice.repo.itemRepo;

import java.util.List;

public class itemService {

    private itemRepo repo;
    public List<Items> getAllItems()
    {
        return repo.findAll();
    }
}
