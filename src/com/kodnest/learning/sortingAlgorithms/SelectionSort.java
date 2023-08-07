package com.kodnest.learning.sortingAlgorithms;

public class SelectionSort 
{
	void sort(int arr[])
	{
		int min, pos, temp, i, j;
		for(i=0; i<=arr.length-2; i++)
		{
			min = arr[i];
			pos = i;
			for(j=i+1; j<=arr.length-1; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					pos = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}

}

// main class = SelectionSortApp