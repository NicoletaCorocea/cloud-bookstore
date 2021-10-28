package com.env.booksreviewsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewsController {


    @GetMapping("/review")
    public String getReview(@RequestParam String bookName) {
        return bookName + " : " + "is a good book";
    }
}
