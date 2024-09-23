package com.learningSpring.learning_Spring.SimpleLauncher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.*;
import java.lang.*;

// 1st bussiness class
// 1st dependancy
// 2nd dependancy
@Component
class bussiness {
	
	private Dependancy1 dependancy1;
	private Dependancy2 dependancy2;
//	@Autowired                // constructor injection.
//	public bussiness(Dependancy1 dependancy1, Dependancy2 dependancy2) {
//		super();
//		this.dependancy1 = dependancy1;
//		this.dependancy2 = dependancy2;
//	}
	
//	@Autowired                             // setter injection.
//	public void setDependancy1(Dependancy1 dependancy1) {
//		this.dependancy1 = dependancy1;
//	}
//	@Autowired								// setter injection.
//	public void setDependancy2(Dependancy2 dependancy2) {
//		this.dependancy2 = dependancy2;
//	}
}
@Component       // field injection
class Dependancy1{	
}
@Component       // field injection
class Dependancy2{}
 @Configuration
 @ComponentScan // always check for the correct package entry it can give an error.
public class SimpleSpringLauncher {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(SimpleSpringLauncher.class)) {
			
		} 
	}
}
