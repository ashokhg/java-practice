package com.kodnest.learning.searchingAlgorithms;

import java.util.Arrays;

public class BinarySearch 
{
	void search(int arr[], int key)
	{
		int high, low, mid;
		low = 0;
		high = arr.length-1;
		while(low <= high)
		{
			mid = (high + low)/2;
			if(key == arr[mid])
			{
				System.out.println("Key found at the position : "+mid);
				return;
			}
			else if(key > arr[mid])
			{
				low = mid + 1;
				high = high;
			}
			else
			{
				low = low;
				high = mid - 1;
			}
		}
		System.out.println("Key not found");
	}

}

// main class = BinarySearchApp

//while(low <= high)
//{
//	mid = (low + high)/2;
//	if(key == arr[mid])
//	{
//		System.out.println("The Key Element found at the index "+mid);
//		System.exit(0);
//	}
//	else if(key > arr[mid])
//	{
//		low = mid + 1;
//		high = high;
//	}
//	else
//	{
//		high = mid-1;
//		low = low;
//	}
//}
//System.out.println("The Element not found in the Array");
