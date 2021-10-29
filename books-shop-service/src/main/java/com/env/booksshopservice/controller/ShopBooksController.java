package com.env.booksshopservice.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopBooksController {

    private static final Logger log = LogManager.getLogger(ShopBooksController.class);

    @GetMapping("/shop")
    public String shop() {
        log.log(Level.INFO, "shop was called");

        return "Les Mis";
    }
}
