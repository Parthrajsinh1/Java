import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private int salary;
	
	public Employee(){
		
	}
	
	public Employee(int empid , String name , int salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	public void acceptEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID , Name , Salary");
		empid=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
	}
	
	public void displayEmp() {
		System.out.println("Employee ID : " + empid + "\n" + "Name : " + name + "\n" + "Salary :" + salary);
		System.out.println("_____________________________________");
	}
}

public class RefrenceArray {


	public static void main(String[] args) {
		
		Employee [] arr = new Employee[5];
		
		arr[0] = new Employee(1,"Parth",1234);
		arr[1] = new Employee(2, "Mukesh", 20000);
		arr[2] = new Employee(3, "Ramesh", 30000);
		arr[3] = new Employee(4, "Suresh", 40000);
		arr[4] = new Employee();
		arr[4].acceptEmp(); // if you just write this u get NPExc , make first obj then call
		
		for(Employee e : arr) {
			e.displayEmp();
		}

	}

}
