package com.library.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;
@EnableEurekaServer
@SpringBootApplication
public class LibraryServicesApplication {

	@Bean
	@Primary
	public RestTemplate  getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryServicesApplication.class, args);
	}

}
