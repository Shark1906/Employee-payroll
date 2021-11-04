package com.emp.demo;

public class Welcome {
	
	public static final int IS_ABSENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int WAGE_PER_HR =20;
	public static final int FULL_TIME_HRS = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation program");
		
		int random = (int)Math.floor(Math.random() * 10 % 2);
	    if(random == IS_PRESENT) {
	    	int empWage = FULL_TIME_HRS * WAGE_PER_HR;
	    	System.out.println("Employee wage : "+empWage);	
	    }
	}

}