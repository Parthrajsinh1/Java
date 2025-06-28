import java.util.Arrays;

public class sumOfAnArray{
	public static void main(String[] args) {

int arr[] = {1,3,5};
//we can print array without index or for loop . like this below 
System.out.println(Arrays.toString(arr));

//Method 1
int sum=0;
for(int i=0 ; i<3 ; i++)
{
	sum = sum + arr[i];
}

System.out.println("Total : "+sum);

//you can do sum with just one function given below.
//Method 2

int s = Arrays.stream(arr).sum();
System.out.println(s);
	}
}
