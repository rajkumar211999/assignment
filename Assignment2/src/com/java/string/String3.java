package com.java.string;

public class String3 {
    public static void main(String[] args) {
		String str1 = "Java string pool refers to the collection "
				+ "of Strings which are stored in heap memory";
		System.out.println("1:To lower case: "+str1.toLowerCase());
		System.out.println("2:To upper case: "+str1.toUpperCase());
		
		String replaceString = str1.replace('a','$');	
		System.out.println("3:Replacing all the a's with $: "+replaceString);
		
		String str2 = "collection";	
		System.out.println("4:does string contains collection: "+str1.contains(str2));
		
		String str3 = "Java string pool refers to the collection "
				+ "of Strings which are stored in heap memory";
		System.out.println("5: "+str1.contains(str3));
		
		if(str1.equals(str3))
		{
			System.out.println("6:String1 is equal to String3");
		}
		else
		{
			System.out.println("6:String1 is not equal to String3");
		}
		
	       }
         }