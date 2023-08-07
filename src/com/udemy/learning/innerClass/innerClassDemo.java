package com.udemy.learning.innerClass;

class Outer
{
	int x = 10; //outer class member variable
	void displayOuter()
	{
		System.out.println("Method inside outer class");
	}
	
	// inner class
	class Inner
	{
		int y = 20;
		void displayInner()
		{
			System.out.println("Method inside inner classs");
			System.out.println("variable 'x' from outer class : "+x);
			System.out.println("variable 'y' from outer class : "+y);
		}
	}
	
	//outer class member method to create object of Inner class
	void createInnerObject()
	{
		Inner i = new Inner();
		i.displayInner();
	}
}


public class innerClassDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.displayOuter();
		
		//creating object of inner class here
		Outer.Inner ii = new Outer().new Inner();
		ii.displayInner();

	}

}
