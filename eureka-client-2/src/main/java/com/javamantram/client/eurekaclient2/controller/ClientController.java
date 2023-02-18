package com.javamantram.client.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Eureka Client Service 2";
	}

}
