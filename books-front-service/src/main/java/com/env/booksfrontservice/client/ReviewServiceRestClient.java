package com.env.booksfrontservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class ReviewServiceRestClient {

    public String getReviews(String bookName) {

        WebClient webClient = WebClient.create("http://books-reviews-service");
        return webClient.get()
                .uri("/review?bookName=" + bookName)
                .retrieve()
                .bodyToFlux(String.class).blockFirst();
    }
}