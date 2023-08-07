package PracticeProblems;

import java.util.Scanner;

public class AssignmentTwo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Dimension");
		String arr[][][] = new String[sc.nextInt()][][];
		
		System.out.println("Enter the 2nd Dimensions for all the 1st Dimension");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the 2nd Dimension for the 1st Dimension "+i);
			arr[i] = new String[sc.nextInt()][];           // Taking the 2nd Dimesnion input from the user
		}
		
		System.out.println("Enter the 3rd Dimension for all the 2nd Dimensions");
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the 3rd Dimension for 1st Dimesnion "+i+" 2nd Dimension "+j);
				arr[i][j] = new String[sc.nextInt()];     // Taking the 3rd Dimension input from the user
			}
		}
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the Branch "+i+" Bank "+j+" Customer "+k+" 's Name");
					arr[i][j][k] = sc.next();
				}
			}
		}
		
		System.out.println("The Name of the Customres are");
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.print(arr[i][j][k]+",  ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
