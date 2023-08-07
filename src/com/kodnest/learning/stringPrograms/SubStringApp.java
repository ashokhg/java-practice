package com.kodnest.learning.stringPrograms;

import java.util.*;

public class SubStringApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SubString s = new SubString();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		
		// scenario 1
		System.out.println("Scenario 1");
		System.out.println("Entered String is : "+str);
		System.out.println("Enter the first index");
		int first_index = scan.nextInt();
		System.out.println();
		
		// calling the function with 2 parameters
		String result1 = s.substr(str, first_index);
		System.out.println("Sub String from index "+first_index+" to end is : "+result1);
		System.out.println();
		
		// scenario 2
		System.out.println("Scenario 2");
		System.out.println("Entered String is : "+str);
		System.out.println("Enter first and last index for the sub string");
		int first_ind = scan.nextInt();
		int last_index = scan.nextInt();
		
		// calling the function with 3 parameters
		String result2 = s.substr(str,  first_ind, last_index);
		System.out.println("Sub String from first index "+first_ind+" to last index "+last_index+" is : "+result2);

	}

}
