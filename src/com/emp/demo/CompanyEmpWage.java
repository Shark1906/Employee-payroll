package com.emp.demo;

import java.util.List;

public class CompanyEmpWage {
	
	private final int wagePerHr;
	private final int noOfWorkingDays;
	private final int hrsPerMonth;
	private final String name;
	List<Integer> dailyWage;
	private int totalwage;
	
	public CompanyEmpWage(int wagePerHr, int noOfWorkingDays, int hrsPerMonth, String name) {
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
	
	public void setTotalwage(int totalwage) {
		this.totalwage = totalwage;
	}

	public int getTotalwage() {
		return totalwage;
	}
	
	@Override
	public String toString() {
		return "Company Name: " + name + ", Wage : " + totalwage + 
				" Daily Wage: " + dailyWage;
	}	
}
