package com.java.oops;
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