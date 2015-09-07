package com.freemarkerdemo.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freemarkerdemo.bean.Author;
import com.freemarkerdemo.bean.Book;

@Controller
public class TypesTestController {

	@RequestMapping(value="/types",method=RequestMethod.GET)
	public String test(HttpServletRequest request) throws ParseException {
		Author author = new Author("张德芬", false, new SimpleDateFormat("yyyy-MM-dd").parse("1983-02-02"));
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("遇见未知的自己", 33.00, new SimpleDateFormat("yyyy-MM-dd").parse("2013-10-02")));
		books.add(new Book("舍得让你爱的人吃苦", 23.40, new SimpleDateFormat("yyyy-MM-dd").parse("2014-07-21")));
		author.setBooks(books);
		request.setAttribute("author", author);
		return "types";
	}
	
	/*
	 * 数据模型是hash，跟"root"这个名字没有关系
	 */
	@RequestMapping(value="/root",method=RequestMethod.GET)
	public String root(HttpServletRequest request) throws ParseException {
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("book", new Book("遇见未知的自己", 33.00, new SimpleDateFormat("yyyy-MM-dd").parse("2013-10-02")));
		request.setAttribute("root", root);
		return "root";
	}
	
	
}
