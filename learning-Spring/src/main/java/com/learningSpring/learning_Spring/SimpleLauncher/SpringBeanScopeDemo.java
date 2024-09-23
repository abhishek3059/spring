package com.learningSpring.learning_Spring.SimpleLauncher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringBeanScopeDemo {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(SpringBeanScopeDemo.class)) {
			
		} 
	}
}
