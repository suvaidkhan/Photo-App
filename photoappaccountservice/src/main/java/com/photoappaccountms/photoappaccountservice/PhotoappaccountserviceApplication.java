package com.photoappaccountms.photoappaccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappaccountserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappaccountserviceApplication.class, args);
	}

}
