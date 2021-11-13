import java.io.*;
import java.util.*;
public class Singleton 
{
	private static Singleton single=new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

SingletonEx.java

import java.io.*;
import java.util.*;
public class Single 
{
	public static void main(String[] args) 
	{
		Singleton ex=Singleton.getInstance();
		ex.getInfo();

	}

}