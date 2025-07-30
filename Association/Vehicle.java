package com.association.aggregration;

import java.util.Scanner;

public class Vehicle {

	String name;
	String num;

	public Vehicle() {

	}

	public Vehicle(String name, String num) {

		this.name = name;
		this.num = num;
	}
	
	public void acceptVehicle(Scanner sc) {
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter num : ");
		num = sc.next();
	}
	
	public void displayVehicle() {
		System.out.println("Name : " + name +"\n" +"Number : " +num);
	}
}
