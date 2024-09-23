package com.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity 
public class Account {
	@Id
	private int accountNumber;
	private String holderName;
	private LocalDate accountDate;
	private double balance;
	 @OneToMany(mappedBy = "account")
	private List<Transactions> transactionList = new ArrayList<Transactions>();
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public LocalDate getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(LocalDate accountDate) {
		this.accountDate = accountDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public List<Transactions> getTransactionList() {
		return transactionList;
	}
	@Autowired
	public void setTransactionList(List<Transactions> transactionList) {
		this.transactionList = transactionList;
	}

	
}
