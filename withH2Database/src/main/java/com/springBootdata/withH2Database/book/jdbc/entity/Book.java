package com.springBootdata.withH2Database.book.jdbc.entity;

import lombok.Data;

@Data
public class Book {

	private long id;
	private String title;
	private String author;
	private String genre;
	
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
}
