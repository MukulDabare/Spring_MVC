package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

	
	@RequestMapping (value = "/login")
	public String  login(@RequestParam String username,@RequestParam String password, Model m ) {
	   m.addAttribute("username", username);
	   m.addAttribute("password", password);
		return "success";
	}
	

//	@RequestMapping (value = "/login")
//	public String  login(@ModelAttribute User u, Model m) {
//		List<User> n=new ArrayList<>();
//		n.add(u);
//		m.addAttribute("data",n);
//		return "welcome";
//	}
	

}
