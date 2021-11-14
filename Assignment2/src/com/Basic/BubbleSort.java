package com.Basic;

import java.io.*;

import java.util.*;

import java.lang.Math;

public class BubbleSort

{

	static void bubbleSort(int a[], int key)

	{

		int i, j, temp;

		boolean found = false;

		for (i = 0; i < 14; i++)

		{

			for (j = 0; j < (14 - i); j++)

			{

				if (a[j] > a[j + 1])

				{

					temp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = temp;

				}

			}

		}

		for (i = 0; i < 15; i++)

		{

			if (a[i] == key)

			{

				found = true;

				System.out.println("Key " + key + " found in the array");

				break;

			}

		}

		if (found == false)

		{

			System.out.println("Key " + key + " not found in the array");

		}

	}

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int a[] = new int[15];

		int i, key;

		System.out.println("Enter 15 elements in the array: ");

		for (i = 0; i < 15; i++)

		{

			a[i] = sc.nextInt();

		}

		System.out.println("Enter the element to be searched: ");

		key = sc.nextInt();

		bubbleSort(a, key);

	}

}
