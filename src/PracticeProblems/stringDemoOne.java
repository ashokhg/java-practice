package PracticeProblems;

public class stringDemoOne 
{

	public static void main(String[] args) 
	{
		String s1 = "KOD";
		String s2 = "NEST";
		String s3 = "KOD"+"NEST";
		String s4 = s1 + s2;
		String s5 = s1 + s2;
	
		if(s5==s4)
		{
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references are not equal");
		}
		if(s5.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		System.out.println();
		System.out.println("Using equalsIgnoreCase() method");
		if(s5.equalsIgnoreCase(s4))
		{
			System.out.println("String are same");
		}

	}

}
