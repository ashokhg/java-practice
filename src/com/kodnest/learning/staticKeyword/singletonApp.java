package com.kodnest.learning.staticKeyword;

public class singletonApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		primeMinister pm1 = primeMinister.getObject();
		System.out.println("First created object = "+pm1);
		
		primeMinister pm2 = primeMinister.getObject();
		System.out.println("Second created object = "+pm2);
		
		primeMinister pm3 = primeMinister.getObject();
		System.out.println("Third created object = "+pm3);

	}

}
