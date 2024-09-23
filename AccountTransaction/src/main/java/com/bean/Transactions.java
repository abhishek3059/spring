package com.bean;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity 
public class Transactions {
	@Id
	private int transactionId;
	private LocalDate transactionDate;
	private String transactionType;
	private double amount;
	 @ManyToOne 
	 @JoinColumn(name = "accountnumber")
	private Account account;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
