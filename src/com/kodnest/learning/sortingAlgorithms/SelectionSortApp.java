package com.kodnest.learning.sortingAlgorithms;

import java.util.*;

public class SelectionSortApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SelectionSort s = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		// enter Array elements
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the element ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements before sorting : ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		// calling the method
		s.sort(arr);
		System.out.println("Array elements after sorting : ");
		{
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
