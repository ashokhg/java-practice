package com.practice.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class A implements Callable, Runnable
{
	List<Integer> myList;
	
	//constructor for initializing myList
	A(List<Integer> myList)
	{
		this.myList = myList;
	}
	
	public List<Integer> call()
	{
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println("Call method called");
		return myList;
		
	}
}

public class CallableDemo 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		Callable obj1 = new A(myList);
		
		List<Integer> result;
		System.out.println(obj1.call());
		
		System.out.println("hello");

	}

}
