package PracticeProblems;

import java.util.Scanner;

public class Two_D_JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the Dimensions");
		int len1 = sc.nextInt();
		int arr[][] = new int[len1][];
		
		for(i=0; i<=arr.length-1; i++) // Removing the code Redundancy for taking the input size for different rows
		{
			System.out.println("Enter the 2nd Dimension Length for "+i+"th Row");
			arr[i] = new int[sc.nextInt()];
		}
		
//		arr[0] = new int[5];
//		arr[1] = new int[3];
//		arr[2] = new int[3];
//		arr[3] = new int[4];
//		arr[4] = new int[2];
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the balance of bank "+i+" Customer "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
