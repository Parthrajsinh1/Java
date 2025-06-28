import java.util.Scanner;
public class userInput
{
	public static void main(String[] args)
	{
		userInput();
	}
	 static int userInput()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Elements in array : ");
		int element = sc.nextInt();		
		int arr[] = new int[element];

		for(int i=0 ; i<arr.length ; i++)
		{
				System.out.println("Enter value of "+i+" : ");
				int value = sc.nextInt();
				arr[i]=value;
		}
    
		System.out.print("Array : ");
    
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
  	return 0;
	}
}
