package PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the "+i+" Element");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The Array Elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key element to search");
		int key = sc.nextInt();
		int low = 0, high = arr.length-1, mid;
		while(low <= high)
		{
			mid = (low + high)/2;
			if(key == arr[mid])
			{
				System.out.println("The Key Element found at the index "+mid);
				System.exit(0);
			}
			else if(key > arr[mid])
			{
				low = mid + 1;
				high = high;
			}
			else
			{
				high = mid-1;
				low = low;
			}
		}
		System.out.println("The Element not found in the Array");
		
	}

}
