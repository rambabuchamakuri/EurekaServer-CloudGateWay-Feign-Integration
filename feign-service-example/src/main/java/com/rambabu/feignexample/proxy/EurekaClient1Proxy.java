package com.rambabu.feignexample.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-client-1")
public interface EurekaClient1Proxy {
	
	@GetMapping("/eureka-client-1/hello")
	public String getMessage_proxy();

}
