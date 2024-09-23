package com.dao;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Account;
import com.bean.Transactions;
import com.repository.AccountRepository;
import com.repository.TransactionsRepository;

import jakarta.transaction.Transactional;

@Repository
public class AccountDAO {
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private TransactionsRepository transactionRepo;


	public void addAccount(Account account) {
		
			accountRepo.save(account);
	}

	public void performTransactionOnAccount(int accountNumber, Transactions transaction) {
	
		Account account = accountRepo.findById(accountNumber).get();
		transaction.setAccount(account);
		transactionRepo.save(transaction);		
	}

	public List<Transactions> retrieveTransactionDetails(int accountNumber, LocalDate startDate, LocalDate endDate) {
		if (!accountRepo.existsById(accountNumber))
			return null;
		List<Transactions> allTransactions = transactionRepo.findByAccount_AccountNumber(accountNumber);
		List<Transactions> specificTransactions =allTransactions.stream()
				.filter(t -> 
					 (!t.getTransactionDate().isAfter(endDate)) && !t.getTransactionDate().isBefore(startDate))
				.toList();

		return specificTransactions;
	}

}
