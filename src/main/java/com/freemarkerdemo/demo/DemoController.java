package com.freemarkerdemo.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(value="/springMvcDemo",method=RequestMethod.GET)
	public ModelAndView springMvcDemo() {
		ModelAndView mv = new ModelAndView("demo");
		mv.addObject("message", "Hello, SpringMVC!");
		return mv;
	}
	
}
