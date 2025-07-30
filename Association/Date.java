package com.association.aggregration;

import java.util.Scanner;

public class Date {

	int day;
	int month;
	int year;

	public Date() {
		System.out.println("Date()");
	}

	public Date(int day, int month, int year) {
		System.out.println("Date(day,  month, year)");
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void acceptDate(Scanner sc) {
		System.out.println("Enter Day : ");
		day = sc.nextInt();
		System.out.println("Enter Month : ");
		month = sc.nextInt();
		System.out.println("Enter Year : ");
		year = sc.nextInt();
	}

	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}
}
