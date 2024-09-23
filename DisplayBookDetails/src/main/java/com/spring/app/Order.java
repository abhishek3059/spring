package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {

	@Autowired
	private Book books;
	@Value("2")
	private int quantity;
		
	public Book getBooks() {
		return books;
	}
	
	public void setBooks(Book books) {
		this.books = books;
	}
	public int getQuantity() {
		return quantity;
	}
	public Order() {
		super();
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double calculateTotalPrice() {
		return this.getQuantity() * this.getBooks().getPrice();
	}
	
	
	public Order(Book books, int quantity) {
		super();
		this.books = books;
		this.quantity = quantity;
	}
	public void displayOrderDetails() {
			System.out.println("Invoice Details:");
			System.out.println("Book Id:"+this.getBooks().getBookId());
			System.out.println("Author:"+this.getBooks().getBookAuthor());
			System.out.println("Quantity:"+this.getQuantity());
			System.out.println("Price of a book:"+this.getBooks().getPrice());
			System.out.println("Total Bill Amount:"+ this.calculateTotalPrice());
			
		
	}

}
