package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

	//sending non-primitive data
//	@RequestMapping (value = "/login")
//	public String  login(@RequestParam String username,@RequestParam String password, ModelMap m ) {
//	   m.addAttribute("username", username);
//	   m.addAttribute("password", password);
//		return "success";
//	}
	

	//sending collection data
	@RequestMapping (value = "/login")
	public String  login(@RequestParam String username,@RequestParam String password, ModelMap m) {
		List<String> names=new ArrayList<String>();
		names.add(username);
		names.add(password);
		m.addAttribute("name", names);
		return "welcome";
	}
	

}
