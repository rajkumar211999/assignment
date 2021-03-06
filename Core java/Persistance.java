package com.java.oops;
import java.io.*;
import java.util.*;
public abstract class Persistence
{
	
	abstract void persist();

}

FilePesistence.java

public class FilePesistence  extends Persistence{

	@Override
	void persist() {
		System.out.println("The data is saved in the file...");
		
	}

}

DatabasePersistence.java

public class DatabasePersistence extends Persistence {

	@Override
	void persist() {
		System.out.println("The data in not saved in database yet....");
		
	}

}

Client.java

import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String[] args)
	{
		Persistence fp=new FilePesistence();
		fp.persist();
		Persistence dp=new DatabasePersistence();
		dp.persist();
	}
}