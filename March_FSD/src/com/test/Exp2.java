package com.test;

class Employee
{
	int id;
	String name;
	
	public Employee() {
		
		System.out.println("default constructor");
	}
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
		System.out.println("parameterized constructor");
	}
	
	//factory method
	public Employee getEmployee()
	{
		return this;
	}
	
	public void show()
	{
		System.out.println("id: "+id+" name: "+name);	
	}
}

public class Exp2 {
	
	public static void main(String[] args) {
		
		//how many ways to create object of Employee class
		
		
		Employee e1 = new Employee(10, "java");//default constructor option 1
		
		Employee e2 = e1.getEmployee();//factory method option 2
		
		//Class.forName("com.test.Employee").newInstance();//reflection option 3
		
		//Employee e3 = e2.clone();//clone method option 4
		
	}
	
}
