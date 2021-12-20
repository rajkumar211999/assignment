package com.springBanking;

public class BankAccount 
{
	public int accountId;
	public String accountHolderName;
	public String accountType;
	public long accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void showBankAccountDetails()
	{
		System.out.println("Account Id = " + accountId);
		System.out.println("Account Holder Name = " + accountHolderName);
		System.out.println("AccountType = " + accountType);
		System.out.println("Account Balance = " + accountBalance);
	}

}
