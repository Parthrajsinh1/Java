public class vowelsCount{
	public static void main(String[] args) {

			hello obj = new hello();
			obj.vowelsCount();
	}

	void vowelsCount()
	{
			int v = 0;
			String s ="suuuiiiii";
			s.toLowerCase();  
			
			for(int i=0 ; i<s.length() ; i++)
			{
				char c = s.charAt(i);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
					v++;
			}
			}
			System.out.println("Total vowels are : "+v);
	}

}
