package com.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeFeign feign;

	@GetMapping("/greet")
	public String greetMsg() {
		String welcome = feign.welcome();
		
		return "Good Morning, "+welcome;
	}
	
}
