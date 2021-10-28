package com.env.booksshopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BooksShopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksShopServiceApplication.class, args);
	}

}
