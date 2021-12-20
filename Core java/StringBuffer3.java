package com.java.string;

public class StringBuffer3 {
	 public static void main(String[] args) {
		  StringBuffer s = new StringBuffer("This method returns the reversed object on which it was called");
		  System.out.println("++++++++++Orginal String+++++++");
		  System.out.println(s);
		  s.reverse();
		  System.out.println("++++++++++Reversed String+++++++");
		  System.out.println(s);
	 }
     }