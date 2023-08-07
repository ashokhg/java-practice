package com.kodnest.learning.stringPrograms;

import java.util.*;

public class StringWordReverse 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentense ");
		String sent = sc.nextLine();
		System.out.println("Entered String is = "+sent);
		String revSent = "";
		
		String strArr[] = sent.split(" ");              // split() function splits the string into sub parts 
		for(int i=0; i<=strArr.length-1; i++)           // strArr = ['HOW', 'ARE', 'YOU']
		{
			String word = strArr[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--)       // word = H O W
			{
				revWord += word.charAt(j);
			}
			
			//System.out.println("Reversed words are : "+revWord);
			revSent += revWord + " ";
		}
		System.out.println("reversed String is = "+revSent);

	}

}
