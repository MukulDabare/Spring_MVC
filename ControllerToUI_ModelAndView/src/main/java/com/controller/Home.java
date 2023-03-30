package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	

	
////sending collection of data
//	@RequestMapping (value = "/login")
//	public ModelAndView  login(@ModelAttribute User u) {
//		List<User> users=new ArrayList<>();
//		users.add(u);                  
//		users.add(u); 
//		users.add(u);                   //viewName  key    values
//		ModelAndView m=new ModelAndView("success", "data", users);
//		return m;
//	}
	
	@RequestMapping (value = "/login")
	public ModelAndView  login(@RequestParam String username, @RequestParam String password) {
		List<String> users=new ArrayList<>();
		users.add(username);                  
		users.add(password); 
		                                 //viewName  key    values
		ModelAndView m=new ModelAndView("welcome", "data", users);
		return m;
	}

}
