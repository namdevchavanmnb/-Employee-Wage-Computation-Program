package com.bridgelabz.basics;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program");

		int empcheck = (int)Math.floor(Math.random()*10)%2;
		
		if(empcheck ==1) {
			System.out.println("Employee Present ");
		}
		else {
			System.out.println("Employee Absent");
		}
	}
}
