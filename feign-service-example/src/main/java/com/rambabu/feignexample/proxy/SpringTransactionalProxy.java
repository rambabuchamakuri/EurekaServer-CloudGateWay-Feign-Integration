package com.rambabu.feignexample.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.rambabu.feignexample.entity.Employee;

// http://localhost:8083/spring-boot-transactional/getemployees
	
// @FeignClient(name="spring-boot-transactional", url = "http://localhost:8083") // without Eureka client registry
@FeignClient(name="spring-boot-transactional", url = "http://localhost:8083")  // with Eureka client registry
public interface SpringTransactionalProxy {
	
	 @GetMapping("/spring-boot-transactional/getemployees")
	 public List<Employee> getEmployee();

}
