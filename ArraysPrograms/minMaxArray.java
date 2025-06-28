public class minMax
{
	public static void main(String[] args)
	{
		minMax();
	}
	 static int minMax()
	{ 
		int arr[] = {233,455,677,899};
		int max=0;
		int min=0;
		flag = arr[0];
		for(int i=0 ; i<arr.length ; i++)
		{
				if(arr[0]<arr[i])
				{
					flag = arr[i];
				}
				else
				{
					pivot = arr[i];
				}
		}
		System.out.print("Array : ");
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nMaximun Value of this array is :  "+ max);
		System.out.println("Minimun Value of this array is :  "+ min);
   	return 0;
	}
}
