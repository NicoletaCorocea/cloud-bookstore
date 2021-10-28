package com.env.booksfrontservice.controller;

import com.env.booksfrontservice.client.BookStoreClient;
import com.env.booksfrontservice.client.ReviewServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {


    @Autowired
    private BookStoreClient bookStoreClient;

    @Autowired
    private ReviewServiceClient reviewServiceClient;

    @GetMapping("/books")
    public String getAllBooksWithReviews() {
        return bookStoreClient.shop() + " - " + reviewServiceClient.getReview("les-mis");
    }
}
