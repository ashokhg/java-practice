package PracticeProblems;

import java.util.Scanner;

public class bubbleSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		int n = arr.length;
		// bubble sort
		for(int i=0; i<=n-2; i++)
		{
			for(int j=0; j<=n-2-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		// end of bubble sort
		System.out.println("Array elements after sorted");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
