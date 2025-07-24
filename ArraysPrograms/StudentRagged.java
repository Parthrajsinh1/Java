import java.util.Scanner;

class Student {

	private int id;
	private String name;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Student ID : " + id + "\n" + "Name : " + name);
		System.out.println("-------------------------------------------");
	}
}

public class StudentRagged {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// StudentRagged obj = new StudentRagged();
		System.out.println("Enter outer array size : "); //first take outer array size
		int outer = sc.nextInt();
		Student[][] studentList = new Student[outer][];
		
		int inner; //for inner we need loop , size of outer
		
		for(int i = 0 ; i<outer ; i++) {
			System.out.println("Enter inner size of array at index "+i+" : ");
			inner=sc.nextInt();
			studentList[i]=new Student[inner]; //do not forget to make obj first with new
		}


		for (int i = 0; i < studentList.length; i++) {
			for (int j = 0; j < studentList[i].length; j++) {
				System.out.println("Enter data : ");
				studentList[i][j] = new Student(sc.nextInt(), sc.nextLine());//do not forget to make obj first with new
			}
		}

		for (int i = 0; i < studentList.length; i++) {
			for (int j = 0; j < studentList[i].length; j++)
				studentList[i][j].display();
		}
	}

}
