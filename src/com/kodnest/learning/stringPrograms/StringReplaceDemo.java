package com.kodnest.learning.stringPrograms;

import java.util.*;

public class StringReplaceDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		System.out.println("String s1 is : "+s1);
		System.out.println("Enter the character you want to replace");
		char c1 = sc.next().charAt(0);
		System.out.println("Enter the character to be replaced ");
		char c2 = sc.next().charAt(0);
	    String s2 =	s1.replace(c1, c2);
	    System.out.println("New String is : "+s2);

	}

}
