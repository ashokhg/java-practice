package com.udemy.learning.innerClass;

abstract class Myclass
{
	abstract void display();
}

class Outer2
{
	//int a = 10;
	void method1()
	{
		
		Myclass mc = new Myclass()   //anonymous class
				{
					void display()
					{
						System.out.println("method in anonymous class");
					}
				};
		mc.display();
	}
}
public class anonymousInnerClassDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer2 o = new Outer2();
		o.method1();

	}

}
