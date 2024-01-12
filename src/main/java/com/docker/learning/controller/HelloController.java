package com.docker.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String home() {
		return "Home Page-2";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World-2";
	}
	
	@GetMapping("/softshop")
	public String softshop() {
		return "Hello!!! You have acccessed the software workshop api.";
	}
	
	@GetMapping("/vikas")
	public String vikas() {
		return "Hello!!! This is Vikas as Computer Science Student";
	}
}
