[8:58 am, 08/11/2021] 😊😊: import java.io.*;
import java.util.*;
public class Singleton 
{
	// Create private attribute that refers to a singleton object
	private static Singleton single=new Singleton();
	
	//Create private constructor that restricts the object to create object
	//outside the class.
	private Singleton()
	{
		
	}
	//Allows us to create and access the object we created.
	public static Singleton getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

}

SingletonEx.java

import java.io.*;
import java.util.*;
public class SingletonEx 
{
	public static void main(String[] args) 
	{
		Singleton ex=Singleton.getInstance();
		ex.getInfo();

	}

}
[8:58 am, 08/11/2021] 😊😊: 2. Hiearchy of an organisation (Employee.java,Manager.java,Labour.java)

Employee.java
import java.io.*;
import java.util.*;
public class Employee 
{
	void salary()
	{
		int sal=25000;
		System.out.println("The salary of an Employee is Rs:" +sal);
		
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.salary();
		Manager m1=new Manager();
		m1.salary();
		Labour l1=new Labour();
		l1.salary();
		
		
	}

}

Manager.java

public class Manager extends Employee 
{
	int incentives=6000;
	void salary()
	{
		int sal;
		sal=25000+incentives;
		System.out.println("The salary of a Manager is Rs:" +sal);
	}
}

Labour.java


public class Labour  extends Employee
{
	int overtime=3;
	void salary()
	{
		int sal;
		sal=8000+(3*200);
		System.out.println("The salary of a Labour is Rs:" +sal);
	}

}
[8:58 am, 08/11/2021] 😊😊: 3.To create bank accounts and use polymorphism (BankAccounts.java)

import java.io.*;
import java.util.*;
public class BankAccounts 
{
	public static void main(String[] args) {
		int a1,a2,TotalCash;
		BankAccounts b1=new SavingsAccount();
		BankAccounts b2= new CurrentAccount();
		a1=((SavingsAccount) b1).cash();
		a2=((CurrentAccount) b2).cash();
		TotalCash=a1+a2;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

}
class SavingsAccount extends BankAccounts
{
	int cash()
	{
		int FixedDeposit=100000;
		return FixedDeposit;
		
	}
}
class CurrentAccount extends BankAccounts
{
	int cash()
	{
		int CashCredit=200000;
		return CashCredit;
	}
}