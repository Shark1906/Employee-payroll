package com.emp.demo;

public class EmpWageBuilder {
	
	public static final int IS_ABSENT = 0;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	static int totalWage;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation program");
		Company jio = new Company(20, 20, 100, "Jio");
		totalWage = new EmpWageBuilder().calculateWage(jio);		
		System.out.println(jio);
		Company vi = new Company(50, 30, 120, "Vi");
		totalWage = new EmpWageBuilder().calculateWage(vi);
		System.out.println(vi);	
	}
	
	private int calculateWage(Company company){
			
		int totalWorkingDay = 0;
		int totalEmpHr =0;
		
		while(totalEmpHr <= company.getHrsPerMonth()  && totalWorkingDay < company.getNoOfWorkingDays()) {
		int random = (int)Math.floor(Math.random() * 10 % 3);
	    totalWorkingDay++;
	    int empHr = 0;
	    
		switch(random) {
			case IS_PART_TIME:
				//System.out.println("Employee is Part time");
				//empWage = 20 * PART_TIME_HRS * WAGE_PER_HR;
				empHr = 4;
				break;
				
			case IS_FULL_TIME:
				//System.out.println("Employee is Full time");
				//empWage = 20 * FULL_TIME_HRS * WAGE_PER_HR;
				empHr = 8;
				break;
			default:
				//System.out.println("Employee is Absent");
				break;
		}
		totalEmpHr = totalEmpHr + empHr;
		}
		return (totalEmpHr * company.getWagePerHr());		
	}
}

