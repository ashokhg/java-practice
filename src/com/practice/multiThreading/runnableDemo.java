package com.practice.multiThreading;

class Ashok implements Runnable
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Ashok");
			try {Thread.sleep(5);} catch(Exception e) {}
		}
	}
	
}

class Abhi implements Runnable
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Abhi");
			try {Thread.sleep(5);} catch(Exception e) {}
		}
	}
}
public class runnableDemo extends Thread
{
	public static void main(String[] args) 
	{
		Runnable obj1 = new Ashok();
		Runnable obj2 = new Abhi();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(5);} catch(Exception e) {}
		t2.start();
	}

}
