package com.springcore.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 	
@ComponentScan
public class RealWorldSpringBusinessDataExtractor {
	public static void main(String[] args) {
	try(var context = new AnnotationConfigApplicationContext(RealWorldSpringBusinessDataExtractor.class)){
		System.out.println(context.getBean("MySQLDataQualifier",BussinessCalculationService.class).findMax());

	}

	}
}
