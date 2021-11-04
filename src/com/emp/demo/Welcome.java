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
	    
		if(random == IS_FULL_TIME) {
	    	empWage = FULL_TIME_HRS * WAGE_PER_HR;
	    	System.out.println("Employee wage : "+empWage);	
	    }
	    else if(random == IS_PART_TIME) {
	    	empWage = PART_TIME_HRS * WAGE_PER_HR;
	    	System.out.println("Employee wage : "+empWage);	
	    }
	}
}

