package com.emp.demo;

public class Company {
	
	private final int wagePerHr;
	private final int noOfWorkingDays;
	private final int hrsPerMonth;
	private final String name;

	public Company(int wagePerHr, int noOfWorkingDays, int hrsPerMonth, String name) {
		super();
		this.wagePerHr = wagePerHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.hrsPerMonth = hrsPerMonth;
		this.name = name;
	}

	public int getWagePerHr() {
		return wagePerHr;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public int getHrsPerMonth() {
		return hrsPerMonth;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Company Name: " + name + ", Wage : " +EmpWageBuilder.totalWage  ;
	}
}
