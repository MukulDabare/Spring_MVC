package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {

	@RequestMapping (value = "/hello")
	public String hello() {
		System.out.println("In hello controller class method");
		return "welcome";
	}
	@RequestMapping (value="/hi")
	public String hi()
	{
		System.out.println("In hellocontroller class hi methods");
		return "hi";
	}
	
}
