package com.DegreedSpringCore.demo.Question3;

public class BankAccountController {
	
	private BankAccountService bankAccountService;
	public void setBankAccountService(BankAccountService bankAccountServiceImpl) {
		this.bankAccountService = bankAccountServiceImpl;
	}
	public BankAccountService getBankAccountServiceImpl() {
		return bankAccountService;
	}
	
	
	
	public double withdraw(long accountId, double balance) {return bankAccountService.withdraw(accountId, balance);}
	public double deposit(long accountId, double balance) {return bankAccountService.deposit(accountId, balance);}
	public double getBalance(long accountId) {return bankAccountService.getBalance(accountId);}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {return bankAccountService.fundTransfer(fromAccount, toAccount, amount);}
    public void getALLAccounts() {  bankAccountService.getAll(); }
}
