package com.DegreedSpringCore.demo.Question3;

import java.util.ArrayList;
import java.util.Iterator;

public class BankAccountepositoryImpl implements BankAccountRepository{
	private ArrayList<BankAccount> accountObjs = new ArrayList<>();
	
	
	public void setAccountObjs(ArrayList<BankAccount> accountObjs) {
		this.accountObjs = accountObjs;
	}
	
	public ArrayList<BankAccount> getAccountObjs(){
		return accountObjs;
	}

	@Override
	public double getBalance(long accountId) {
		for(BankAccount bankAccount : this.getAccountObjs()) {
			if(bankAccount.getAccountId() == accountId) {
				return bankAccount.getAccountBalance();
			}
		}
		 return 0;

		
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		for(BankAccount bankAccount : this.getAccountObjs()) {
			if(bankAccount.getAccountId()==accountId) {
			 bankAccount.setAccountBalance(newBalance);
			 
			}
		}
		return newBalance;

	}

	@Override
	public void displayDetails() {
		System.out.println("The Accounts are :");
		for(BankAccount bankAccount : this.getAccountObjs()) {
			System.out.println(bankAccount);
			
		}

		
	}
	
	

}
