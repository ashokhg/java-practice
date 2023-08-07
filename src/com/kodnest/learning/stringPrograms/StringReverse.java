package com.kodnest.learning.stringPrograms;

import java.util.Scanner;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		System.out.println("The String s1 is : "+s1);
		char arr1[] = s1.toCharArray();
		char arr2[] = new char[arr1.length];
		//reversing the Array
		int j = arr1.length-1;             // starting j from the last(array length-1)
		for(int i=0; i<=arr1.length-1; i++)
		{
			arr2[j] = arr1[i];
			j--;
		}
		
		s1 = new String(arr2);
		System.out.println("The reversed String is");
		System.out.println(s1);
	}
	
}


//steps
//1.create a string
//2.convert into char array
//3.reverse the array
//4.convert char array into string
//5.print new string
//end

