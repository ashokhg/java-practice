package com.kodnest.learning.constructorsDemo;

public class EmployeeApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e = new Employee(12, 500);
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
