package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/")
	public String home(){
		return "<h3>CI/CD and Cloud DevOps<h3>";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "<b>Jenkins Demo<b>";
	}
	
	@GetMapping("/test")
	public String test() {
		return "<b>Deploy Spring Boot using Jenkins<b>";
	}
	
	@GetMapping("/charan")
	public String name() {
		return "Hello ! This is Charan !";
	}
	
	
}