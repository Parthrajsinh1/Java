import java.util.Scanner;

public class RaggedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter outer array size : ");
		int[][] arr = new int[2][];

		arr[0] = new int[2];
		arr[1] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter Array elemnts at -> " + i + j);
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Values for : " + arr[i][j]);
			}
		}
		for (int[] ele : arr)
			for (int e : ele)
				System.out.println("Values : " + e);
	}

}
