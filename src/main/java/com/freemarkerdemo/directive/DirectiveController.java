package com.freemarkerdemo.directive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DirectiveController {

	@RequestMapping(value="/directiveTest",method=RequestMethod.GET)
	public ModelAndView directiveTest() {
		ModelAndView mv = new ModelAndView("directive");
		mv.addObject("upper", new UpperDirective());
		return mv;
	}
	
	@RequestMapping(value="/parameterDirectiveTest",method=RequestMethod.GET)
	public ModelAndView parameterDirectiveTest() {
		ModelAndView mv = new ModelAndView("parameterDirective");
		mv.addObject("repeat", new RepeatDirective());
		return mv;
	}
	
}
