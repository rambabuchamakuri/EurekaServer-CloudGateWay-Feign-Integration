package com.rambabu.feignexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignServiceExampleApplication.class, args);
	}

}
