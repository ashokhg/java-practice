package com.udemy.learning.innerClass;

class Outer1
{
	void createLocalInnerClass()
	{
		class localInner
		{
			void innerDisplay()
			{
				System.out.println("Method of local inner class");
			}
		}
		
		//creating object of localInner class
		localInner li = new localInner();
		li.innerDisplay();
	}
}


public class localInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o1 = new Outer1();
		o1.createLocalInnerClass();

	}

}
