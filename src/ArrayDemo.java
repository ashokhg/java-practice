import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		for(int i= 0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the Salary of Employee " +i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Salary details are");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
