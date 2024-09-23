package com.practise.SpringJpa.SpringBootJPADemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practise.SpringJpa.SpringBootJPADemo.controller.AddressController;
import com.practise.SpringJpa.SpringBootJPADemo.controller.PersonController;
import com.practise.SpringJpa.SpringBootJPADemo.entity.Person;

@SpringBootApplication
public class SpringBootJpaDemoApplication {
	
	public static PersonController personloadCrudApp(String[] args) {
		var context = SpringApplication.run(SpringBootJpaDemoApplication.class, args);
		 var personController = (PersonController) context.getBean(PersonController.class);
		 return personController;
	}
	public static AddressController addressloadCrudApp(String[] args) {
		var context = SpringApplication.run(SpringBootJpaDemoApplication.class, args);
		 var addressController = (AddressController) context.getBean(AddressController.class);
		 return addressController;
	}

	public static void main(String[] args) {
		PersonController personController = personloadCrudApp(args);
		AddressController addressController = addressloadCrudApp(args);
		 
		
		 
	}

}
