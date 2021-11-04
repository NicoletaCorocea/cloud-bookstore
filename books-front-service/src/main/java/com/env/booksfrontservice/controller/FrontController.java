package com.env.booksfrontservice.controller;

import com.env.booksfrontservice.client.BookStoreClient;
import com.env.booksfrontservice.client.ReviewServiceClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    private static final Logger log = LogManager.getLogger(FrontController.class);

    @Autowired
    private BookStoreClient bookStoreClient;

    @Autowired
    private ReviewServiceClient reviewServiceClient;

    @GetMapping("/books")
    public String getAllBooksWithReviews() {
        String result = "bla bla";
        try {
            result = bookStoreClient.shop() + " - " + reviewServiceClient.getReview("les-mis");
        } catch (Exception ex) {
           log.error(ex);
        }
        return result;
    }
}
