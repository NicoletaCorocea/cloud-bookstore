package com.env.booksfrontservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name = "books-shop-service")
public interface BookStoreClient {

    @RequestMapping(method = RequestMethod.GET, value = "/shop")
    String shop();
}


