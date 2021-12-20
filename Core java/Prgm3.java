package com.java.generics;

import java.util.Arrays;

public class Prgm3 {

	public static void main(String[] args) {
		Double ar[]= {24.0,12.0,34.13,3.14,56.97};
		swap(ar, 4, 1);
		System.out.println(Arrays.toString(ar));
	}
	
	public static <Type>void swap(Type a[],int i,int j){
		Type temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
