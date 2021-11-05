package com.emp.demo;

public class Welcome {
	
	public static final int IS_ABSENT = 0;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_PER_MONTH = 100;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation program");
		int empHr = 0;
		int totalEmpHr =0;
		int totalWorkingDay = 0;
		
		while(totalEmpHr <= MAX_HRS_PER_MONTH && totalWorkingDay < NO_OF_WORKING_DAYS ) {
		int random = (int)Math.floor(Math.random() * 10 % 3);
	    totalWorkingDay++;
		
		switch(random) {
			case IS_PART_TIME:
				System.out.println("Employee is Part time");
				//empWage = 20 * PART_TIME_HRS * WAGE_PER_HR;
				empHr = 4;
				break;
				
			case IS_FULL_TIME:
				System.out.println("Employee is Full time");
				//empWage = 20 * FULL_TIME_HRS * WAGE_PER_HR;
				empHr = 8;
				break;
			default:
				System.out.println("Employee is Absent");
				break;
		}
		totalEmpHr = totalEmpHr + empHr;
		}
		System.out.println("Monthly Employee Wage : " + totalEmpHr * WAGE_PER_HR);
	}
}

