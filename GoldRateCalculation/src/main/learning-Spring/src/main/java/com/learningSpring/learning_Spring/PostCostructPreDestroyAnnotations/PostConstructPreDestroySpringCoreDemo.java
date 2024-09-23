package com.learningSpring.learning_Spring.PostCostructPreDestroyAnnotations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//As we can see CDI annotations are nothing but alternative to the spring annotations.

    
//@Component equivalent
@Named  // jakarta.inject package annotations
class BussinessService{
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}
	//@Autowired equivalent 
	@Inject   // jakarta.inject package annotations 
	public void setDataService(DataService dataService) {
		System.out.println("setter injection");
		this.dataService = dataService;
	}
	
}
@Component
class DataService {
	
}
@Configurable
@ComponentScan
public class PostConstructPreDestroySpringCoreDemo {
	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				(PostConstructPreDestroySpringCoreDemo.class) ;
		Arrays.stream(
					context.getBeanDefinitionNames())
								.forEach(System.out::println);
	}
		

	
}
