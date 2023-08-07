package com.kodnest.learning.sortingAlgorithms;

import java.util.Scanner;

public class InsertionSortApp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the element");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//calling the method
		InsertionSort s = new InsertionSort();
		s.sort(arr);
		System.out.println();
		System.out.println("Array after sorting");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
