package com.rambabu.feignexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rambabu.feignexample.proxy.EurekaClient1Proxy;
import com.rambabu.feignexample.proxy.HelloWorldProxy;
import com.rambabu.feignexample.proxy.SpringTransactionalProxy;

import com.rambabu.feignexample.entity.Employee;

@RestController
public class CallingOtherServices {

	//@Autowired
	//private HelloWorldProxy helloproxy;
	
	@Autowired
	private EurekaClient1Proxy client1Proxy;
	
	@Autowired
	private SpringTransactionalProxy trxProxy;
	
	// http://localhost:8085/feign-service/getHello
	// this service is calling http://localhost:8081/hello-world-boot/rambabu
	/* 
	@GetMapping("/getHello")
	public String getHello() {
		return helloproxy.hello_rambabu();
		
	}
	*/
	
	//http://localhost:8085/feign-service/client1 
	@GetMapping("/client1")
	public String simpleHello() {
		return client1Proxy.getMessage_proxy();
	}
	
	
	
	@GetMapping("/test")
	public String test() {
		return "test";
		
	}
	
	
	// http://localhost:8085/feign-service/getallemployees
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees(){
		return trxProxy.getEmployee();
	}

}
