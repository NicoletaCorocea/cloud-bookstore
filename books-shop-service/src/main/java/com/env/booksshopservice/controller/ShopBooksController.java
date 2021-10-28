package com.env.booksshopservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopBooksController {

    @GetMapping("/shop")
    public String shop() {
        return "Les Mis";
    }
}
