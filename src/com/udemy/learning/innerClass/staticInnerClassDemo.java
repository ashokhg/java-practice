package com.udemy.learning.innerClass;

class Outer3
{
	int x = 10;
	static int y = 20;
	void outerDisplay()
	{
		System.out.println("Outer class display method");
	}
	
	static class Inner
	{
		void innerDisplay()
		{
			System.out.println("y is : "+y);
			System.out.println("Inner class display method");
		}
	}
}

public class staticInnerClassDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer3 o = new Outer3();
		o.outerDisplay();
		
		//creating object for static inner class
		Outer3.Inner i = new Outer3.Inner();    // object created without creating object for Outer class

	}

}
