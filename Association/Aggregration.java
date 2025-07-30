package com.association.aggregration;

import java.util.Scanner;

public class Aggregration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Employee e= new Employee();
//		e.displayEmployee();
//		
//		Employee e1 = new Employee(1, "parth", 200000, 2, 7, 2009);
//		e1.displayEmployee();

		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.addVehicle(sc);
		e2.displayEmployee();
	}

}
