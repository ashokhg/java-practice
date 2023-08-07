package PracticeProblems;

import java.util.Scanner;

public class Three_D_JaggedArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i, j;
		int arr[][][] = new int[3][][];
		arr[0] = new int[2][];
		arr[1] = new int[3][];
		arr[2] = new int[4][];
		
		arr[0][0] = new int[2];
		arr[0][1] = new int[3];
		
		arr[1][0] = new int[2];
		arr[1][1] = new int[3];
		arr[1][2] = new int[2];
		
		arr[2][0] = new int[4];
		arr[2][1] = new int[3];
		arr[2][2] = new int[2];
		arr[2][3] = new int[2];
		
//		reading the array elements
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the School "+i+" Class "+j+" Student "+k+" Marks");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
//		printing the Array elements
		System.out.println("The Array elements are");
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
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
