package com.test;

import jakarta.persistence.*;

@Entity
@Table(name="CONTRACT_EMPLOYEE")
@DiscriminatorValue("CONTRACT")
public class ContractEmployee extends Employee {

    private int hours;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}