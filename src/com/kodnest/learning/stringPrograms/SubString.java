package com.kodnest.learning.stringPrograms;

public class SubString 
{
	String substr(String str, int first_index)
	{
		char arr[] = str.toCharArray();
		char arr2[] = new char[arr.length-first_index];
		for(int i=first_index, j=0; i<=arr.length-1; i++, j++)
		{
			arr2[j] = arr[i];
		}
		
		String result = new String(arr2);
		return result;
	}
	
	String substr(String str, int first_index, int last_index)
	{
		char arr[] = str.toCharArray();
		char arr2[] = new char[(last_index-first_index)+1];
		for(int i=first_index, j=0; i<=last_index; i++, j++)
		{
			arr2[j] = arr[i];
		}
		
		String result = new String(arr2);
		return result;
	}

}

// main class = SubStringApp