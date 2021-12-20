package com.springBanking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("banking.xml");
        BankAccountController obj = (BankAccountController) context.getBean("obj");
        obj.withdraw();
	}

}
