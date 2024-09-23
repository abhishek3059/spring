package com.learningSpring.learning_Spring.XmlFileApplicationContext;

import java.util.Arrays;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class XMLFileApplicationContextSpringCore {
	public static void main(String[] args) {
		var context = 
				new ClassPathXmlApplicationContext(xmlcontext.xml);
				 
		Arrays.stream
					(context.getBeanDefinitionNames())
								.forEach(System.out::println);
	}
		

	
}
