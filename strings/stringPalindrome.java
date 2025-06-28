public class stringPalindrome
{
	public static void main(String[] args)
	{
			hello obj = new hello();
			obj.palindrome("pop");
	}

	void palindrome(String s)
	{
		String rev=""; //take a empty string

		for(int i=s.length()-1 ;i>=0 ;i--)  //start a rev for loop
		{
							rev = rev + s.charAt(i); //store the main string to the rev empty string
		}

		if(s.equals(rev)) // compare both of then using equal function
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
