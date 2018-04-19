package com.springboot.EurekaBootServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBootServerApplication {
//main	
	public static void main(String[] args) {
		SpringApplication.run(EurekaBootServerApplication.class, args);
	}

}
