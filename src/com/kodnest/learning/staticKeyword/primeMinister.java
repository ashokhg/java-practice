package com.kodnest.learning.staticKeyword;

public class primeMinister 
{
	static primeMinister pm = null;
	
	private primeMinister()
	{
		
	}
	
	public static primeMinister getObject()
	{
		if(pm == null)
		{
			pm = new primeMinister();
			return pm;
		}
		else
		{
			return pm;
		}
	}

}

// Main class = singletonApp
