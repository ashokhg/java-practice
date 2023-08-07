package com.kodnest.learning.searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BinarySearch bs = new BinarySearch();
		
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		// inputing the Array elements
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the element");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);  // sorting the Array
		// printing the Array elements
		System.out.println("Array elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the Key element to search : ");
		int key = sc.nextInt();
		
		//calling the method
		bs.search(arr, key);

	}

}
