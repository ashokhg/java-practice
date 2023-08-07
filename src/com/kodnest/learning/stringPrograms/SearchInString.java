package com.kodnest.learning.stringPrograms;

import java.util.*;

public class SearchInString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SearchStr obj = new SearchStr();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
//		System.out.println("Enter a letter to search ");
//		char key = sc.next().charAt(0);
		
		boolean result = obj.checkStr(str);
		if(!result)
		{
			System.out.println("0 : S is not present in the string");
		}
		else
		{
			System.out.println("1 : S is present in the String ");
		}
		
	}

}
