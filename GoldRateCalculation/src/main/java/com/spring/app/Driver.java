package com.spring.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
		var context = new ClassPathXmlApplicationContext("beans.xml");
		GoldRateInfo goldRateInfo = (GoldRateInfo) context.getBean("rateInfoObj");
		return goldRateInfo;
	}
	
public static void main(String[] args){
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the carat:");
	int carat = in.nextInt();
	System.out.println("Enter Total Grams:");
	double grams = in.nextDouble();
	GoldRateInfo goldRateInfo = loadGoldRateDetails();
	System.out.println("Total Gold Rate is Rs:"+ goldRateInfo.calculateGoldRate(carat, grams));
	;
	
	
}

}
	 	  	    	    		        	 	
