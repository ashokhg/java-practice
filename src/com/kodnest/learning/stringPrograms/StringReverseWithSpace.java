package com.kodnest.learning.stringPrograms;

import java.util.Scanner;

public class StringReverseWithSpace 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println("Entered String is = "+s1);
		char arr1[] = s1.toCharArray();
		char arr2[] = new char[arr1.length];
		
		// Replace the space at exact position
		for(int i=0; i<=arr1.length-1; i++)
		{
			if(arr1[i] == ' ')
			{
				arr2[i] = arr1[i];
			}
		}
		
		//reversing the array
		int j = arr1.length-1;
		for(int i=0; i<=arr1.length-1; i++)
		{
			if(arr1[i] != ' ')       // check if arr1 element is not a space, if so, then check space in arr2
			{
				if(arr2[j] == ' ')   // check for arr2 element is a space , then simply decriment
				{
					j--;
				}
				arr2[j] = arr1[i];
				j--;
			}	
		}
		
		s1 = new String(arr2);
		System.out.println("Reversed String is = "+s1);

	}

}

//steps
//1.creating string by taking input
//2.convert it into char array
//3.reverse the array
//	* first check for spaces and replace it with exact position in the second array
//	* traverse both the array by checking for spaces , if space then simply increment i and dicrement j
//4.convert array into string
//5.print the string
