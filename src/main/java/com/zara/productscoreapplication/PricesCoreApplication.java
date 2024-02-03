package com.zara.productscoreapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PricesCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricesCoreApplication.class, args);
	}


}
