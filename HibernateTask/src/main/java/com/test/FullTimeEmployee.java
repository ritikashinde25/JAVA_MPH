package com.test;

import jakarta.persistence.*;

@Entity
@Table(name="FTE_EMPLOYEE")
@DiscriminatorValue("FTE")
public class FullTimeEmployee extends Employee {

    private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    
}