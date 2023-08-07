package com.kodnest.learning.sortingAlgorithms;

import java.util.Scanner;

public class BubbleSortApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Anter the Array length");
		int arr[] = new int[sc.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the element");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements before sorting");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		BubbleSort s = new BubbleSort();
		s.sort(arr);
		System.out.println("Array elememts after sorting");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
