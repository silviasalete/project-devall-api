package com.devall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class DevallApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevallApplication.class, args);
	}

}
