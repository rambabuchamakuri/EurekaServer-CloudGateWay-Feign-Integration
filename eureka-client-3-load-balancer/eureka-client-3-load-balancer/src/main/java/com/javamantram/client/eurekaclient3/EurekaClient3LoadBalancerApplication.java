package com.javamantram.client.eurekaclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@EnableEurekaClient

public class EurekaClient3LoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient3LoadBalancerApplication.class, args);
	}

}
