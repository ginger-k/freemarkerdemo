package com.freemarkerdemo.method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerTest {

	@RequestMapping(value="/methodTest",method=RequestMethod.GET)
	public String methodTest(HttpServletRequest request) {
		request.setAttribute("indexOf", new IndexOfMethod());
		return "demo";
	}
	
	
}
