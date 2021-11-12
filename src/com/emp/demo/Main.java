package com.emp.demo;

public class Main {
	
	public static void main(String[] args) {
	
	System.out.println("Welcome to employee wage computation program");
	EmpWageBuilder builder = new EmpWageBuilder();
	CompanyEmpWage jio = new CompanyEmpWage(20, 20, 100, "Jio");
	builder.calculateWage(jio);		
	//System.out.println(jio);
	builder.arrOfCompanies[0] = jio;
	CompanyEmpWage vi = new CompanyEmpWage(50, 30, 120, "Vi");
	builder.calculateWage(vi);
	//System.out.println(vi);
	builder.arrOfCompanies[1] = vi;
	System.out.println(builder.arrOfCompanies[0] + "\n" + builder.arrOfCompanies[1]);
	}
}
