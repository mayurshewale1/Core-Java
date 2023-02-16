package com.tns.inheritance;

public class Employee extends Person {
	private int salary;
	private String dept;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String name, String city, int salary, String dept) {
		super(name, city);	
		this.salary = salary;
		this.dept = dept;
		System.out.println("Employee class parameterized constructor");
		
	}

	public Employee() {
		super();	
		System.out.println("Employee class Default constructor");
		//super(); base constructor must be first stmt in child class constructor
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", Name=" + getName() + ", City=" + getCity()
				+ "]";
	}
	
	@Override
	public void show()
	{
		System.out.println("In Employee show()");
		super.show();
	}

}

