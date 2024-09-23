package com.DegreedSpringCore.demo.Question1;

import java.util.ArrayList;
import java.util.List;

public class CustomerIntegration {
 private List<Customer> customerlist = new ArrayList<>();

public CustomerIntegration(List<Customer> customerlist) {
	super();
	this.customerlist = customerlist;
}


public List<Customer> getCustomerlist() {
	return customerlist;
}


public void setCustomerlist(List<Customer> customerlist) {
	this.customerlist = customerlist;
}


public void displayDetails() {
	for(Customer C : this.getCustomerlist()) {
		System.out.println(C);
	}
}


public CustomerIntegration() {
	super();
}
 
}
