package com.ahmad.ecom_apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcomApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApigatewayApplication.class, args);
	}

}
