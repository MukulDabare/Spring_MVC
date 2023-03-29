package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
	
	
//@RequestMapping (value = "/home")
//	public String home(@RequestParam String username, @RequestParam String password ) {
//		
//		System.out.println(username);
//		System.out.println(password);
//		return "welcome";
//	}

//@RequestMapping (value = "/home/{username}/{password}")
//public String home(@PathVariable String username, @PathVariable String password ) {
//	
//	System.out.println(username);
//	System.out.println(password);
//	return "welcome";
//}
	
	@RequestMapping (value = "/home")
	public String home(@ModelAttribute User u ) {
		
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		return "welcome";
	}	

}
