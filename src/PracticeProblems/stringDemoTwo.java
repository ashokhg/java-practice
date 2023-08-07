package PracticeProblems;

import java.util.Scanner;

public class stringDemoTwo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = "KODNEST";
		System.out.println("String s1 = "+s1);
		String s2 = s1.concat("Tech");
		System.out.println("String s1 after concatination = "+s1);
		System.out.println("Concatinated String s2 = "+s2);
		
		System.out.println();
		System.out.println("_____________________________________");
		System.out.println();
		System.out.println("Assignin gstring reference");
		
		String s3 = "Ashok";
		String s4 = s3;
		System.out.println("String s3 = "+s3);
		System.out.println("String s4 = "+s4);
		if(s3 == s4)
		{
			System.out.println("s3 and s4 references are same");
		}
		else
		{
			System.out.println("Refernces are not same");
		}
		if(s3.equals(s4))
		{
			System.out.println("String s3 and s4 are same");
		}
		else
		{
			System.out.println("String s3 and s4 are not same");
		}
		

	}

}
