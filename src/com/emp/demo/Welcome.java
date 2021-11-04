package com.emp.demo;

public class Welcome {
	
	public static final int IS_ABSENT = 0;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int FULL_TIME_HRS = 8;
	public static final int PART_TIME_HRS = 4;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation program");
		int empWage = 0;
		int random = (int)Math.floor(Math.random() * 10 % 3);
	    
		switch(random) {
			case IS_PART_TIME:
				System.out.println("Employee is Part time");
				empWage = 20 * PART_TIME_HRS * WAGE_PER_HR;
				break;
				
			case IS_FULL_TIME:
				System.out.println("Employee is Full time");
				empWage = 20 * FULL_TIME_HRS * WAGE_PER_HR;
				break;
			default:
				System.out.println("Employee is Absent");
				break;
		}
		System.out.println("Monthly Employee Wage : " + empWage);
	}
}

