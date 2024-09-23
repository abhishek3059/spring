package com.learningSpring.learning_Spring.SpringBeanScopesDemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component  //Indicates whether a bean is to be lazily initialized
class PrototypeClass{

}
@Configurable
@ComponentScan
public class LearningSpringBeanScope {
	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				(LearningSpringBeanScope.class) ;
		System.out.println("if prototype bean shows up four times ");
		System.out.println(context.getBean(NormalClass.class));//  it will retreive the same bean the hashcodes of first and second
		System.out.println(context.getBean(NormalClass.class));//  statements are the same in the output therefore giving the same bean.
		System.out.println(context.getBean(NormalClass.class));// so basically all the normal beans without @Scope are singleton in nature
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(PrototypeClass.class));// new Hashcode (each time new instance)
		System.out.println(context.getBean(PrototypeClass.class));// new Hashcode 
		System.out.println(context.getBean(PrototypeClass.class));// new Hashcode 
			
		  

	}
}
