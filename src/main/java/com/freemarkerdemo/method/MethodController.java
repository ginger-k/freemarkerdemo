package com.freemarkerdemo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MethodController {

	@RequestMapping(value="/methodTest",method=RequestMethod.GET)
	public ModelAndView methodTest() {
		ModelAndView mv = new ModelAndView("method");
		mv.addObject("indexOf", new IndexOfMethod());
		return mv;
	}
	
	
}
