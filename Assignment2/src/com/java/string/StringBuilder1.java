package com.java.string;

public class StringBuilder1 {
	 public static void main(String[] args) {
		  StringBuilder sb = new StringBuilder("This method returns the reversed object on which it was called");
		  System.out.println("++++++++++Orginal String+++++++");
		  System.out.println(sb);
		  sb.reverse();
		  System.out.println("++++++++++Reversed String+++++++");
		  System.out.println(sb);
	 }
     }