import java.util.Scanner;

public class RaggedInputUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array size : ");
		int outer = sc.nextInt();
		int[][] arr = new int[outer][];
		int inner;
		for (int i = 0; i < outer; i++) {
			System.out.println("enter inner array size of index : " + i);
			inner = sc.nextInt();
			arr[i] = new int[inner];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter element of " + i + " " + j);
				arr[i][j] = sc.nextInt();
			}
		}

		for (int[] ele : arr)
			for (int e : ele)
				System.out.println("Value is : " + e);

		sc.close();
	}

}
