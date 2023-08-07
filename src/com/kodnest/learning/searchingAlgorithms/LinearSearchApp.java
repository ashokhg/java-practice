package com.kodnest.learning.searchingAlgorithms;

import java.util.*;

public class LinearSearchApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinearSearch ls = new LinearSearch();     // object creation
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the element");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Array elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the key element to search : ");
		int key = sc.nextInt();
		
		// calling the search method
		ls.search(arr, key);

	}

}
