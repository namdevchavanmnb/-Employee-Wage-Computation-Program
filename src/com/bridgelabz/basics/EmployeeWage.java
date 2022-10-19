package com.bridgelabz.basics;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program");

		int empcheck = (int)Math.floor(Math.random()*10)%2;
		int is_Full_Time=1;
		int wageperHr=20;
		int FullDayHr=8;
		if(empcheck==is_Full_Time) {
			System.out.println("Employee Present ");
			System.out.println("Employee Daily Wage is="+wageperHr*FullDayHr);
		}
		else {
			System.out.println("Employee Absent");
		}
	}
}
