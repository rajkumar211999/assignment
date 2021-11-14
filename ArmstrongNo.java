package com.Basic;
import java.io.*;

import java.util.*;

import java.lang.Math;

public class ArmstrongNo {

	static void checkArmstrong(int n)

	{

		int count = 0, rem = 0, temp = n;

		double x = 0.0;

		while (temp != 0)

		{
			temp = temp / 10;

			count = count + 1;

		}

		System.out.println("Number of digits is " + count);

		temp = n;

		while (temp != 0)

		{

			rem = temp % 10;

			x = x + Math.pow(rem, count);

			temp = temp / 10;

		}

		if (x == n)

		{

			System.out.println("Given number " + n + " is an armstrong number");

		}

		else

		{

			System.out.println("Given number " + n + " is not an armstrong number");

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int a = sc.nextInt();

		System.out.println("Entered number:" + a);

		checkArmstrong(a);

	}

}