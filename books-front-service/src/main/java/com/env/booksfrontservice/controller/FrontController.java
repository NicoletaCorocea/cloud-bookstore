package com.env.booksfrontservice.controller;

import com.env.booksfrontservice.client.BookShopRestClient;
import com.env.booksfrontservice.client.ReviewServiceRestClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    private static final Logger log = LogManager.getLogger(FrontController.class);

    @Autowired
    private BookShopRestClient bookShopRestClient;

    @Autowired
    private ReviewServiceRestClient reviewServiceRestClient;

    @GetMapping("/books")
    public String getAllBooksWithReviews() {
        String result = "";

        try {
            result = bookShopRestClient.shop();
        } catch (Exception ex) {
            result += " shop fault";
            log.error(ex);
        }

        result += " ----- ";

        try {
            result += " " + reviewServiceRestClient.getReviews("Les Mis");
        } catch (Exception ex) {
            result += " reviews fault";
            log.error(ex);
        }

        return result;
    }
}
