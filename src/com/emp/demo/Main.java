package com.emp.demo;

public class Main {
	
	public static void main(String[] args) {
	
	System.out.println("Welcome to employee wage computation program");
	EmpWageBuilder builder = new EmpWageBuilder();
	CompanyEmpWage jio = new CompanyEmpWage(20, 20, 100, "Jio");
	builder.calculateWage(jio);
	builder.addCompanyEmpWage(jio);
	CompanyEmpWage vi = new CompanyEmpWage(50, 30, 120, "Vi");
	builder.calculateWage(vi);
	builder.addCompanyEmpWage(vi);
	builder.printAllCompanyEmpWage();
	
	}
}
