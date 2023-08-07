package PracticeProblems;

class Sort
{
	void sort(int arr[])
	{
		int temp = 0, j=0;
		for(int i=0; i<arr.length; i++)
		{
			temp = arr[i];
			for(j=i; (j>0 && arr[j-1]>temp); j--)
			{
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
		
		for(int k = 0; k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		Sort obj = new Sort();
		int arr[] = {48, 65, 6, 55};
		obj.sort(arr);

	}

}
