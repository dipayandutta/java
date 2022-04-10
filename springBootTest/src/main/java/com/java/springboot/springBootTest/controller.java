package com.java.springboot.springBootTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@RequestMapping
	public String home() {
		return "Home";
	}
	
	
}
