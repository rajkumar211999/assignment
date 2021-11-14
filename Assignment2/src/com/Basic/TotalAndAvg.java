package com.Basic;

import java.io.*;

import java.util.*;

import java.lang.Math;

public class TotalAndAvg

{

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int a, b, c, total;

		double avg = 0.0;

		System.out.println("Enter the marks of A subject: ");

		a = sc.nextInt();

		System.out.println("Enter the marks of B subject: ");

		b = sc.nextInt();

		System.out.println("Enter the marks of C subject: ");

		c = sc.nextInt();

		total = a + b + c;

		avg = (total / 3);

		System.out.println("Total marks scored is " + total + " and average is " + avg);

//System.out.println("Total marks in A subject is "+a+" its average is "+(a/100));

	}

}