package com.example.FinanceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.FinanceProject.*",})
public class FinanceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceProjectApplication.class, args);
	}

}
