import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

      //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt(); 
        System.out.println("Enter column number : ");
        int column = sc.nextInt();
       int [][] a = new int[row][column];
       int [][] b = new int[row][column];
       int [][] c = new int[row][column];

       for(int i =0 ; i<a.length ; i++){
        for(int j=0 ; j<a.length ; j++){
            System.out.println("Enter of A value : ");
            a[i][j] = sc.nextInt();
        }
       }

       for(int i =0 ; i<b.length ; i++){
        for(int j=0 ; j<b.length ; j++){
            System.out.println("Enter of B value : ");
            b[i][j] = sc.nextInt();
        }
       }
                                            //add two matrix 
       for(int i =0 ; i<c.length ; i++){
        for(int j=0 ; j<c.length ; j++){
            c[i][j] = a[i][j] + b[i][j];   
        }
       }
                                            //print the sum matrix
       for(int i =0 ; i<c.length ; i++){
        for(int j=0 ; j<c.length ; j++){
            System.out.print(c[i][j]+" ");  
        }
        System.out.println(" ");
       }
       
    }
}
