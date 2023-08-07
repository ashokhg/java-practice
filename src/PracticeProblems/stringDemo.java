package PracticeProblems;

import java.util.Scanner;

public class stringDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = "Ashok";               			// stored in constant pool
		String s1= new String("Ashok");   			// stored in non-constant pool
		char arr[] = {'A','s','h','o','k'};
		String s2 = new String(arr);      			// created using char Array
		System.out.println("Enter the String");
		String s3 = sc.next();
		
		if(s==s3)
		{
			System.out.println("References are same");
		}
		else
		{
			System.out.println("References are not same");
		}
		
		if(s.equals(s3))
		{
			System.out.println("Stings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}

}
