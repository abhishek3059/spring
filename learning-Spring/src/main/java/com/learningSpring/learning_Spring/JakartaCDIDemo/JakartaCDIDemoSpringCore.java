package com.learningSpring.learning_Spring.JakartaCDIDemo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class NormalClass{
	private Dependancy dependancy;
	public NormalClass (Dependancy dependancy) {
		this.dependancy = dependancy;
		System.out.println("All dependancies are injected here ............. After this initialized should be printed then its a success");
	}
	@PostConstruct
	 public void intitialization() {
		Dependancy.getReady();
		
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleaning up before destroying ");
	}

}



@Component
class Dependancy{

	public static void getReady() {
	    System.out.println("initialized");
		
	}
	
}
@Configurable
@ComponentScan
public class JakartaCDIDemoSpringCore {
	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				(JakartaCDIDemoSpringCore.class) ;
		Arrays.stream(
					context.getBeanDefinitionNames())
								.forEach(System.out::println);
	}
		

	
}
