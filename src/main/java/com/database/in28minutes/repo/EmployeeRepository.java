package com.database.in28minutes.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.database.in28minutes.entity.Employee;
import com.database.in28minutes.entity.FullTimeEmployee;
import com.database.in28minutes.entity.PartTimeEmployee;

@Repository
@Transactional
public class EmployeeRepository {


	@Autowired
	private EntityManager em;
	
	public Employee findEmployee(Long id) {
		Employee employee = em.find(Employee.class, id);
		return employee;
		
	}
	
	public void insertEmployee(Employee employee) {
		em.persist(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return em.createQuery("select e from Employee e", Employee.class).getResultList();
	}
	
	public List<PartTimeEmployee>	getPartTimeEmployees(){
		List<PartTimeEmployee> partTimeEmployeesList = em.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
		return partTimeEmployeesList;
	}
	
	public List<FullTimeEmployee>	getFullTimeEmployee(){
		List<FullTimeEmployee> FullTimeEmployeeList = em.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
		return FullTimeEmployeeList;
	}
}
