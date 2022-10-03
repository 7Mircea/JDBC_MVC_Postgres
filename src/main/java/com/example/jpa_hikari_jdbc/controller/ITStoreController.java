package com.example.jpa_hikari_jdbc.controller;

import com.example.jpa_hikari_jdbc.model.Products;
import com.example.jpa_hikari_jdbc.repository.ITStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itStore")
public class ITStoreController {

    @Autowired
    ITStoreRepository repository;

    @GetMapping("/products")
    public Iterable<Products> getAllProducts(){
        return repository.findAll();
    }

}
