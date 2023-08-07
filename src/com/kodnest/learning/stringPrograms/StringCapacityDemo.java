package com.kodnest.learning.stringPrograms;

public class StringCapacityDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());         // capacity of the string (default is 16)
		s.append("Virat Kohli is a batsman");
		System.out.println(s.capacity());        // capacity is increased(by old capacity * 2 + 2 )as the string is large
		System.out.println("new capacity after new string appended is = "+s.capacity());
		s.append("he plays for RCB");
		System.out.println("capacity after new string appended is = "+s.capacity());
		
		// creating new string with specified capacity while creating
		StringBuffer s1 = new StringBuffer(35);
		System.out.println(s1.capacity());
		System.out.println("s1 capacity (specified while creation of string is = "+s1.capacity());

	}

}
