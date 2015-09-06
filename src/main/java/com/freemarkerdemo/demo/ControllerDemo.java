package com.freemarkerdemo.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerDemo {

	@RequestMapping(value="/springMvcDemo",method=RequestMethod.GET)
	public String login(HttpServletRequest request) {
		request.setAttribute("message", "Hello, SpringMVC!");
		return "demo";
	}
	
}
