public class hello
{
	public static void main(String[] args)
	{
			hello obj = new hello();
			obj.spaces("i am jodd ");
	}

	void spaces(String s)
	{
		String m="";    // take empty string
		for(int i=0 ; i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c==' ') 
			{
				m = m + '/'; //if character has space replace it with space and also add to empty string
			}
			else{
				m = m + c ; // if character is not space but a real character then store it in empty string
			}
		}
		// if you dont use else block then it will only print /// not characters 
		System.out.println(m);
	}
}
