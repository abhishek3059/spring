package com.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {
	
	public static Order loadBookDetails() {
	    var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	    Order order = (Order) context.getBean(Order.class);
		return order ;
	}

	public static void main(String[] args) {
		Order order = loadBookDetails();
		order.displayOrderDetails();
	}

}
