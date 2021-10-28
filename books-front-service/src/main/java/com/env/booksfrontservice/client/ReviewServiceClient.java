package com.env.booksfrontservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "books-reviews-service")
public interface ReviewServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/review")
    String getReview(@RequestParam("bookName") String bookName);
}
