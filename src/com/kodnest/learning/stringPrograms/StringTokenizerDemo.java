package com.kodnest.learning.stringPrograms;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringTokenizer s1 = new StringTokenizer("KODNEST TECHNOLOGIES PVT LTD", " ");
		while(s1.hasMoreTokens() == true)
		{
			System.out.println(s1.nextToken());
		}

	}

}
