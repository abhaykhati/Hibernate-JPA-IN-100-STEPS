package com.database.in28minutes.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	private BigDecimal salary;

	public FullTimeEmployee(String name,BigDecimal salary) {
		super(name);
		this.salary = salary;
	}
	
	
}
