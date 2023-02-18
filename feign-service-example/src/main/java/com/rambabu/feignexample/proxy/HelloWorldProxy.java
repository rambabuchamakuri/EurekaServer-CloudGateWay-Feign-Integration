package com.rambabu.feignexample.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// @FeignClient(name = "hello-world-boot", url = "http://localhost:8081" )  // without Eureka client registry
@FeignClient(name = "hello-world-boot" )  // with Eureka client registry
public interface HelloWorldProxy {
	
	@GetMapping("/hello-world-boot/rambabu")
	public String hello_rambabu();
	
}
