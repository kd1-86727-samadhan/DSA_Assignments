package com.sam.q2;

import java.util.Scanner;

public class Employee {
	int empId;
	String ename;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String ename, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter the employee id: ");
		empId = sc.nextInt();

		System.out.println("Enter the name of employee");
		ename = sc.next();

		System.out.println("Enter the salary: ");
		salary = sc.nextDouble();
	}

}
