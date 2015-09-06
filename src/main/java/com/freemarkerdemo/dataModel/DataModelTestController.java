package com.freemarkerdemo.dataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freemarkerdemo.bean.Author;
import com.freemarkerdemo.bean.Book;

@Controller
public class DataModelTestController {

	@RequestMapping(value="/dataModelObject",method=RequestMethod.GET)
	public String login(HttpServletRequest request) throws ParseException {
		Author author = new Author("张德芬", false, new SimpleDateFormat("yyyy-MM-dd").parse("1983-02-02"));
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("遇见未知的自己", 33.00, new SimpleDateFormat("yyyy-MM-dd").parse("2013-10-02")));
		books.add(new Book("舍得让你爱的人吃苦", 23.40, new SimpleDateFormat("yyyy-MM-dd").parse("2014-07-21")));
		author.setBooks(books);
		request.setAttribute("author", author);
		return "dataModelObject";
	}
	
}
