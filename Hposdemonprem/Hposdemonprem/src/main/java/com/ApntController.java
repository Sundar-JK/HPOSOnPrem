package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody

@RestController
public class ApntController {

	@GetMapping("/hi")	
	public String sayHi() {
		
		return "hi";
	}
	
	@GetMapping("/hello")	
	public String sayHello() {
		
		return "hello";
	}
}
