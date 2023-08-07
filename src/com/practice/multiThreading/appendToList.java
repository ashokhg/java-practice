package com.practice.multiThreading;


class hi extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
		
	}
}

class hello extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

public class appendToList extends Thread
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		obj1.start();
		try{Thread.sleep(100);} catch(Exception e){}
		obj2.run();
		

	}

}
