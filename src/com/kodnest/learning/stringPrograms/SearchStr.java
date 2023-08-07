package com.kodnest.learning.stringPrograms;

public class SearchStr 
{
	boolean checkStr(String str)
	{
		char ch[] = str.toCharArray();
		for(int i=0; i<=ch.length-1; i++)
		{
			if(ch[i] == 's' || ch[i] == 'S')
			{
				return true;
			}
		}
		return false;
	}

}

// main class = searchInString
