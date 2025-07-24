import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("Enter array elements : ");
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("Elements with for loop -> "+ arr[i]);
		}
		
		for(int e: arr) {
			System.out.println("Elemnts with for-each -> " + e);
		}

	}

}
