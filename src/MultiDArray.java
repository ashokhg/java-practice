import java.util.Scanner;
//hello
public class MultiDArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Dimensions ");
		Scanner sc = new Scanner(System.in);
		int arr[][][] = new int [sc.nextInt()][sc.nextInt()][sc.nextInt()];
		
		int i, j, k;
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				for(k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the marks of college "+i+ "Branch "+j+ "Student "+k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(i=0; i<=arr.length-1; i++)
		{
			for(j=0; j<=arr[i].length-1; j++)
			{
				for(k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
//		System.out.println();
	}

}
