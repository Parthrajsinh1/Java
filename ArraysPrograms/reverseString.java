
import java.util.Scanner;


public class revString{
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String : ");
			String s = sc.next();

			System.out.println("Your String is : "+s);
			//Method 1
			String r = "";
			for(int i= s.length()-1 ; i>=0 ; i--)
			{
				r = r + s.charAt(i);
			}

			System.out.println("Your Reverse String is : "+r); 
			
			//Method 2
			String r1 = new StringBuilder(s).reverse().toString();
			System.out.println("Another String is : "+r1);
	}


}
