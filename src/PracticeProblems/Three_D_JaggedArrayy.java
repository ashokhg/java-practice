package PracticeProblems;

import java.util.Scanner;

public class Three_D_JaggedArrayy 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Dimension "); //3
		int arr[][][] = new int[sc.nextInt()][][];
		
		//Taking the input for 2nd Dimension
		System.out.println("Enter the 2nd Diminesion");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the 2nd Dimension for all 1st Dimension "+i);
			arr[i] = new int[sc.nextInt()][];
		}
		
		// Taking the input for 3rd Dimension for all the second Dimension
		System.out.println("Enter the 3rd Dimension length");
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the 3rd Dimension for the 1st Dimension "+i+" 2nd Dimension "+j);
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		
		// Taking the Array elements as input
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the College "+i+" Class "+j+" Student "+k+" 's Marks");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		// Printing the Array elements
		System.out.println("The Array elements are");
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
