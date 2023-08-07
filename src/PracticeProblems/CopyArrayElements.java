package PracticeProblems;

import java.util.Scanner;

public class CopyArrayElements 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		int arr2[] = new int[arr.length];
		
		System.out.println("Enter the Array elements");
		for(i=0; i<=arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// Copying the Array elements
		for(i=0, j=arr.length-1; i<=arr.length-1; i++, j--)
		{
			arr2[j] = arr[i];
		}
		
		// Displaying the Array elements
		System.out.println("arr Elements are");
		for(i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		// Displaying Array 2 elements
		System.out.println();
		System.out.println("arr2 Elements are");
		for(i=0; i<=arr.length-1; i++) 
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
