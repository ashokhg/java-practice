package com.practice.multiThreading;

import java.util.ArrayList;
import java.util.List;

class FirstThread implements Runnable
{
	public List<Integer> myList;
	
	//constructor 
	FirstThread(List<Integer> myList)
	{
		this.myList = myList;
	}
	
	public void run()
	{
//		int len = myList.size();
//		len /= 2;
		int ele = 10;
		for(int i=0; i<=4; i++)
		{
			myList.add(ele);
			ele += 10;
			System.out.println(myList);
			//try{Thread.sleep(500);} catch(Exception e) {}
		}
		
	}
}

class SecondThread implements Runnable
{
	public List<Integer> myList;
	
	//constructor
	SecondThread(List<Integer> myList)
	{
		this.myList = myList;
	}
	
	public void run()
	{
		int ele = 60;
		for(int i=5; i<=9; i++)
		{
			myList.add(ele);
			ele += 10;
			System.out.println(myList);
			//try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

public class listAppend 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		
		Runnable obj1 = new FirstThread(myList);
		Runnable obj2 = new SecondThread(myList);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(500);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Heeellllllloooooooooooooo");

	}

}
