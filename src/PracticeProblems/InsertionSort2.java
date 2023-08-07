package PracticeProblems;


class Sort2
{
	void sort(int arr[])
	{
		int temp = 0, j=0;
		for(int i=0; i<arr.length; i++)
		{
			temp = arr[i];
//			for(j=i; (j>0 && arr[j-1]>temp); j--)
			for(j=i; j>0; j--)
			{
				if(arr[j-1]<temp)
				{
					break;
				}
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

public class InsertionSort2 
{

	public static void main(String[] args) 
	{
		Sort2 obj = new Sort2();
		int arr[] = { 48, 65, 6, 55};
		obj.sort(arr);
		

	}

}
