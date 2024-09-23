package com.learningSpring.learning_Spring.dependancyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;
import java.lang.*;


 @Configuration
 @ComponentScan("com.learningSpring.learning_Spring.SimpleLauncher") // always check for the correct package entry it can give an error.
public class DependecyInjection {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependecyInjection.class)) {
			 
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
	}
}
