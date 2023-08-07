package com.kodnest.learning.stringPrograms;

public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("KOD");
		System.out.println(s);
		s.append("NEST");        // append() method for mutable string and concat() is method for immutable strings 
		System.out.println(s);  // appended to the original string 

	}

}
