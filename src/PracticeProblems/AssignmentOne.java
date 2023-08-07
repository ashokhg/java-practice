package PracticeProblems;

import java.util.Scanner;

public class AssignmentOne 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the Dimensions");
		Double arr[][] = new Double[sc.nextInt()][];
		
		for(i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the 2nd Dimension Length for the 1st Dimension "+i);
			arr[i] = new Double[sc.nextInt()];
		}
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the Height of Team "+i+" Player "+j);
				arr[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("The Height of the Players: ");
		System.out.println();
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+ ", ");
			}
			System.out.println();
		}

	}

}
