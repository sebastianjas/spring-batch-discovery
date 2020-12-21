package com.example.springbatchdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBatchDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchDiscoveryApplication.class, args);
	}

}
