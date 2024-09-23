package com.learningSpring.learning_Spring.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;
import java.lang.*;


 @Configuration
 @ComponentScan("com.learningSpring.learning_Spring.game") // always check for the correct package entry it can give an error.
public class App3BasicSpringBean {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App3BasicSpringBean.class)) {
			context.getBean(GameRunner.class).run();
			context.getBean(GamingConsole.class).up(); // implemented in game mario check declaration of up .
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
