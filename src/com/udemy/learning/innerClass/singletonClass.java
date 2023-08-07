package com.udemy.learning.innerClass;

class CoffeeMachine
{
	private float coffeeQuantity;
	private float waterQuantity;
	
	static private CoffeeMachine our = null;
	
	private CoffeeMachine()
	{
		coffeeQuantity = 1;
		waterQuantity = 10;
	}
	
	public static CoffeeMachine getInstatnce()
	{
		if(our == null)
		{
			our = new CoffeeMachine();
		}
		return our;
	}
	
	
	void display()
	{
		System.out.println("Display method of CoffeeMachine class");
		System.out.println("coffeeQuantity is : "+coffeeQuantity);
		System.out.println("waterQuantity is : "+waterQuantity);
	}
}

public class singletonClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// CoffeeMachine cfm = new CoffeeMachine();   -------> it will give because constructor is private
		//creating object using static block
		CoffeeMachine cfm = CoffeeMachine.getInstatnce();
		cfm.display();

	}

}
