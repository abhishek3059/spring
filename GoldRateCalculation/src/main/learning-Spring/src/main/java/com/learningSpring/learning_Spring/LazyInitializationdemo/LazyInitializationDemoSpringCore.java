package com.learningSpring.learning_Spring.LazyInitializationdemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}
@Component @Lazy //Indicates whether a bean is to be lazily initialized
class ClassB{
	private ClassA classA;
	// Spring is injecting dependancy of  ClassA into ClassB through a constructor 
	public ClassB(ClassA classA) {
		System.out.println("lazy bean initialized");
		this.classA = classA;
	}
}
@Configurable
@ComponentScan
public class LazyInitializationDemoSpringCore {
	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				(LazyInitializationDemoSpringCore.class) ;
		System.out.println("if this statement is first lazy initialization successful");
			context.getBean(ClassB.class);
		  

	}
}
