package com.freemarkerdemo.bean;

import java.util.Date;

public class Book {

	private String title;
	private double price;
	private Date publishDate;
	private Author author;

	public Book() {
		
	}
	
	public Book(String title, double price, Date publishDate) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Date getPublishDate() {
		return publishDate;
	}



	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}



	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
