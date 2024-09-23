package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
	public List<Transactions> findByAccount_AccountNumber(int accountNumber);

}
