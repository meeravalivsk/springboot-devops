package com.test;

public class Employee {

	private int employeeNumber;
	private String employeeName;
	private int employeeSalary;
	
	public Employee(int employeeNumber, String employeeName, int employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}

