package com.env.booksfrontservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class BookShopRestClient {

    public String shop() {

        WebClient webClient = WebClient.create("http://books-shop-service");
        return webClient.get()
                .uri("/shop")
                .retrieve()
                .bodyToFlux(String.class).blockFirst();
    }
}
