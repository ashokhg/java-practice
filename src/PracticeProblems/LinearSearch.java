package PracticeProblems;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Array Elements");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array Elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the Key element to search");
		int key = sc.nextInt();
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(key == arr[i])
			{
				System.out.println("Element found at the Index "+i);
				System.exit(0);			}
		}
		
		System.out.println("Key not found in the Array");

	}

}
