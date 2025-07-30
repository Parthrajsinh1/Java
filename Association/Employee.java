package com.association.aggregration;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	Date doj;
	Vehicle vh;

	public Employee() {
		doj = new Date();
		System.out.println("Employee()");
	}

	public Employee(int id, String name, double salary, int day, int month, int year) {
		System.out.println("Employee( id,  name,  salary)");
		doj = new Date(day, month, year);
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter id : ");
		id = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextDouble();
		System.out.println("Enter Date of Joining ");
		doj.acceptDate(sc);
							
		}
		
	public void addVehicle(Scanner sc) {

		vh = new Vehicle();
		vh.acceptVehicle(sc);
	}

	public void displayEmployee() {
		System.out.println("ID = " + id);
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);
		doj.displayDate();
		
		if(vh!=null)
			vh.displayVehicle();
		
		System.out.println("----------------------------");
	}

}
