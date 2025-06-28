import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        searchElement();
    }

    static int searchElement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Elements in array: ");
        int element = sc.nextInt();		

        int arr[] = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value of " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Element found at index " + i);
                found = true;
                break;  // stop after first match (optional)
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        return 0;
    }
}
