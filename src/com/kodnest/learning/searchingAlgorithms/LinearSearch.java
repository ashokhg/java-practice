package com.kodnest.learning.searchingAlgorithms;

public class LinearSearch 
{
	void search(int arr[], int key)
	{
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i] == key)
			{
				System.out.println("Key found at the position : "+i);
				return;
			}
		}
		
		System.out.println("Key not found");
	}

}

// main class = LinearSearchApp