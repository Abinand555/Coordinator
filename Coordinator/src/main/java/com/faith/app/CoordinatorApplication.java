package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoordinatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoordinatorApplication.class, args);
		
		System.out.println("Hello!");
	}

}
