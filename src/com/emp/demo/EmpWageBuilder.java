package com.emp.demo;

public class EmpWageBuilder implements EmpWageInterface {
	
	CompanyEmpWage arrOfCompanies[] = new CompanyEmpWage[5];
	public static final int IS_ABSENT = 0;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	@Override
	public int calculateWage(CompanyEmpWage companyEmpWage){
			
		int totalWorkingDay = 0;
		int totalEmpHr =0;
		
		while(totalEmpHr <= companyEmpWage.getHrsPerMonth()  && totalWorkingDay < companyEmpWage.getNoOfWorkingDays()) {
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
		return (totalEmpHr * companyEmpWage.getWagePerHr());		
	}
}

