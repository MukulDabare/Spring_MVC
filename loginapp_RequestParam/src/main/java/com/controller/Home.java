package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
//	@RequestMapping (value = "/login")
//	public String  login(String username, String password ) {
//		System.out.println(username);
//		System.out.println(password);
//		return "success";
//	}
	
//	@RequestMapping (value = "/login")
//	public String  login(@RequestParam String username,@RequestParam String password ) {
//		System.out.println(username);
//		System.out.println(password);
//		return "success";
//	}
	
//	@RequestMapping (value = "/login/{username}/{password}")
//	public String  login(@PathVariable String username,@PathVariable String password ) {
//		System.out.println(username);
//		System.out.println(password);
//		return "success";
//	}
	
	@RequestMapping (value = "/login")
	public String  login(@ModelAttribute User u ) {
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		return "success";
	}
	

}
