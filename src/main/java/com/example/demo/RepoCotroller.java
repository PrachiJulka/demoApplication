package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.TestService;

@RestController
public class RepoCotroller {

	@Autowired
	TestService service;
	
	@GetMapping("hello")
	String callMe() {
		
		service.test();
		
		return "hello";
	}
	
}
