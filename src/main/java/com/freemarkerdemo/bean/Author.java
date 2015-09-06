package com.freemarkerdemo.bean;

import java.util.Date;
import java.util.List;

public class Author {

	private String name;
	private boolean gender;
	private Date birthday;
	private List<Book> books;
	
	public Author() {
	}

	public Author(String name, boolean gender, Date birthday) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
