package com.springBanking;

public abstract class BankAccountServiceImpl  implements BankAccountService
{
	long accountId;
	double balance;
	long fromAccount;
	long toAccount;
	double account;
	
	public void withdraw()
	{
		System.out.println("AccountId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void balance()
	{
		System.out.println("AccountId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void deposit()
	{
		System.out.println("AccountId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void fundTransfer()
	{
		System.out.println("AccountId" +accountId);
		System.out.println("Balance" +balance);
	}

}
