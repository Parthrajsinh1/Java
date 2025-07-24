
public class ArityVariable {
						 //(int[] a) 
	public static void add(int...a) { 
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		//int[] arr = new int[2];
		
		//arr[0] = 10 --instead of use below 
		
		//int[] arr = new int[] { 10, 11, 12 }; -- too long use this 
		
		//int[] arr= {10,10,10};--still long use this
		
		//add(new int[] {10,10,10});--too much use this 
		
		add(10,10,10); // for use this u need variable arity ...
		//also you can as many arguments threw this 
		
		add(10,10,10,10,10,10,10,10);
	}

}
