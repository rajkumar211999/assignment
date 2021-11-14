package com.java.bank;

public class ActBankC{

	
	BankAccServiceImpl bankaccountS = new BankAccServiceImpl() {
		
		public double withdraw(long accountId, double balance) {
			
			return withdraw(15000,1500);
		}
		
		public double getBalance(long accountId) {
			
			return getBalance(150);
		}
		
		public boolean fundTransfer(long fromAccount, long toAccount, double aount) {
			
			return false;
		}
		
		public double deposit(long accountId, double balance) {
		
			return deposit(15000, 1500);
		}
	};

	public void withdraw() {
		
		return;
	}
	
	
}