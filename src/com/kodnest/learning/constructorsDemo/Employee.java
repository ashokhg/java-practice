package com.kodnest.learning.constructorsDemo;

public class Employee 
{
	private int empid;
	private String name;
	private int salary;
	
	public Employee()                                          // Default Constructor
	{
		
	}
	
	public Employee(int empid, String name, int salary)        // Parameterized Constructor 1
	{
		this();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int empid, int salary)                     // Parameterized Constructor 2
	{
		this(12, "prahllad", 5000);
		this.empid = empid;
		this.salary = salary;
		this.name = "omkar";
	}
	
	// getters
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}

}


// Main class = EmployeeApp