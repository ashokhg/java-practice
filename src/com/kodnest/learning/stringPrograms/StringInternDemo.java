package com.kodnest.learning.stringPrograms;

public class StringInternDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = new String("Ashok");
		String s2 = s1.intern();
		System.out.println("S1 (stored in non-constant pool) is = "+s1);
		System.out.println("s2 (stored in constant pool by copying the string s1 froom the non-constant pool) is = "+s2);
		
	}

}
