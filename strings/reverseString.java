import java.util.Scanner;
public class revString{
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String : ");
			String s = sc.next();

			System.out.println("Your String is : "+s);
			//Method 1
			String r = ""; // take a empty string 
			for(int i= s.length()-1 ; i>=0 ; i--) // start for loop in reverse order
			{
				r = r + s.charAt(i); // store the original string characters into the reverse string 
			} 

			System.out.println("Your Reverse String is : "+r); 
			
			//Method 2
			String r1 = new StringBuilder(s).reverse().toString(); //use build in function 
			System.out.println("Another String is : "+r1);
	}


}
