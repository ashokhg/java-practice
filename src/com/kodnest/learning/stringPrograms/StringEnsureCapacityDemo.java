package com.kodnest.learning.stringPrograms;

public class StringEnsureCapacityDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder();
		System.out.println("Default capacity of s1 : "+s1.capacity());
		s1.ensureCapacity(50);      // providing capacity
		System.out.println("ensure capacity of s1 : "+s1.capacity());

	}

}
