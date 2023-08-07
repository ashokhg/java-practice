package com.kodnest.learning.staticKeyword;

public class StaticDemo 
{
	int a;
	int b;
	int c;
	static int x;
	static int y;
	static int z;
	
	// instance block
	{
		a = 10;
		b = 20;
		c = 30;
	}
	static   // static block
	{
		x = 40;
		y = 50;
		z = 60;
	}
	
	public void display1()
	{
		System.out.println(a+" "+b+" "+c);
		System.out.println(x+" "+y+" "+z);
	}
	
	public static void display2()
	{
		System.out.println(x+" "+y+" "+z);
	}

}

// Main class = staticDemoApp
