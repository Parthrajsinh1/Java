public class hello
{
	public static void main(String[] args)
	{
		minMax();
	}
   static int minMax()
	{ 
		int arr[] = {10,10,10,10};
		int sum=0;
		int avg=0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		avg = sum/arr.length;
		
		System.out.print("Array : ");
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nSum Value of this array is :  "+ sum);
		System.out.println("Average Value of this array is :  "+ avg);
		return 0;
	}
}
