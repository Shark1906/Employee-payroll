package com.emp.demo;

public class Main {
	
	public static void main(String[] args) {
	
	System.out.println("Welcome to employee wage computation program");
	EmpWageBuilder builder = new EmpWageBuilder();
	Company jio = new Company(20, 20, 100, "Jio");
	builder.calculateWage(jio);		
	System.out.println(jio);
	Company vi = new Company(50, 30, 120, "Vi");
	builder.calculateWage(vi);
	System.out.println(vi);
	}
}
