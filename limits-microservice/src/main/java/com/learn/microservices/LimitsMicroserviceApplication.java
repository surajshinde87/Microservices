package com.learn.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsMicroserviceApplication.class, args);
        System.out.println("Application is Started");
	}

}
