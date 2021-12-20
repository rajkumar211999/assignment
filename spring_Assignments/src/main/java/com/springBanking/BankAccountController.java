package com.springBanking;

public class BankAccountController 
{
	BankAccountServiceImpl accounts = new BankAccountServiceImpl() {
		public double withdraw(long accountId,double balance)
		{
			return withdraw(1000,1000);
		}
		public double getBalance(long accountId)
		{
			return getBalance(150);
		}
		
		public boolean fundTransfer(long fromAccount,long toAccount,double account)
		{
			return false;
		}
		
		public double deposit(long accountId,double balance)
		{
			return deposit(1000,1000);
		}
	};
	
	public void withdraw()
	{
		return;
	}
	
	

}
