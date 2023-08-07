package com.kodnest.learning.stringPrograms;

import java.util.Scanner;

public class ReplaceWithDollar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println("Entered String is = "+s1);
		s1 = s1.replaceAll(" ", "$");
		System.out.println("$ Replaced String is = "+s1);

	}

}
