package com.greet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface WelcomeFeign {

	@GetMapping("/welcome")
	public String welcome();
	
}
