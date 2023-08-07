package com.kodnest.learning.stringPrograms;

import java.util.Scanner;

public class ReverseSentense 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentense");
		String sent = sc.nextLine();
		System.out.println("Entered String is = "+sent);
		String strArr1[] = sent.split(" ");            // strArra1 = ['HOW', 'ARE', 'YOU']
		String strArr2[] = new String[strArr1.length];
		int j = strArr2.length-1;
		for(int i=0; i<=strArr1.length-1; i++) 
		{
			strArr2[j] = strArr1[i];
			j--;
		}
		System.out.print("Reversed Sentense is = ");
		for(int i=0; i<=strArr2.length-1; i++)
		{
			System.out.print(strArr2[i]+" ");
		}
		
	}

}
