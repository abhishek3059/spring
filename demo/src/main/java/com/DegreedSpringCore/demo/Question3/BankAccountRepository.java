package com.DegreedSpringCore.demo.Question3;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	public void displayDetails();

}
