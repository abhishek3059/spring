package com.DegreedSpringCore.demo;

import java.util.Scanner;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DegreedSpringCore.demo.Question3.*;

public class SpringCoreDegreedSolvedQuestionConfigContexLauncherApp {
	//Question 1
//	public static CustomerIntegration load() {
//		var context = new ClassPathXmlApplicationContext("beans.xml");
//		return (CustomerIntegration)context.getBean("CustomerIntegration");
//	}
	//Question 2
//	public static Question Load(int choice) {
//		var context = new ClassPathXmlApplicationContext("question2.xml");
//		switch(choice) {
//		case 1: return (Question) context.getBean("question1");
//				
//		case 2:	return (Question) context.getBean("question2");
//				
//		case 3: return (Question) context.getBean("question3");
//		
//		default: System.out.println("Enter the valid choice");
//				return null;
//				 
//		}
//	}
	//Question 3 
	public static BankAccountController LoadBankApp() {
		var context = new ClassPathXmlApplicationContext("question3.xml");
		return (BankAccountController)context.getBean("controller");
	}

	public static void main(String[] args) {
		BankAccountController bankAccountController = LoadBankApp();
		bankAccountController.getALLAccounts();
		System.out.println(bankAccountController.getBalance(324485568));
		System.out.println("Depositing");
		System.out.println(bankAccountController.deposit(324342343, 300));
		System.out.println("Withdraw");
		System.out.println(bankAccountController.withdraw(45677989, 10000));
		System.out.println("get Balance");
		System.out.println(bankAccountController.getBalance(45677989));
		System.out.println("transfering initiated");
		System.out.println(bankAccountController.fundTransfer(45677989, 324485568, 12984));
		
		
		
		
		
	}

}
