package com.DegreedSpringCore.demo.Question3;

import java.util.Iterator;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountRepository bankAccountRepository;

	public void setBankAccountRepository(BankAccountRepository bankAccountepositoryImpl) {
		this.bankAccountRepository = bankAccountepositoryImpl;
	}

	public BankAccountRepository getBankAccountRepositoryImpl() {
		return bankAccountRepository;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		double withdrawAmount = bankAccountRepository.getBalance(accountId) - balance;
		bankAccountRepository.updateBalance(accountId, withdrawAmount );
		return withdrawAmount;
	}

	@Override
	public double deposit(long accountId, double balance) {
		double finalAmount = bankAccountRepository.getBalance(accountId) + balance; 
		bankAccountRepository.updateBalance(accountId, finalAmount);
		return finalAmount;
		
		

	}

	@Override
	public double getBalance(long accountId) {

		return bankAccountRepository.getBalance(accountId);
		
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
			if(bankAccountRepository.getBalance(fromAccount) < amount) {
				return false;
			}
			else {
				bankAccountRepository.updateBalance(toAccount, amount + bankAccountRepository.getBalance(toAccount));
				return true;
			}
	
	}

	@Override
	public void getAll() {
		bankAccountRepository.displayDetails();
		
	}

}
