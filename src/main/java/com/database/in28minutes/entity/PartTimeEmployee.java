package com.database.in28minutes.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee  extends Employee{
	
	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	private BigDecimal hourlyWage;

	public PartTimeEmployee(String name,BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
	}
	
	
	
	

}
