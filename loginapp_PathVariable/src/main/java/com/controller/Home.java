package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping (value = "/login/{username}/{password}")
	public String  login(@PathVariable String username,@PathVariable String password ) {
		System.out.println(username);
		System.out.println(password);
		return "success";
	}
	


}
