package com.database.in28minutes.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
/*@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "EmployeeType")*/
public abstract class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "ename", nullable = false)
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	
}
