package com.database.in28minutes;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.in28minutes.entity.Employee;
import com.database.in28minutes.entity.FullTimeEmployee;
import com.database.in28minutes.entity.PartTimeEmployee;
import com.database.in28minutes.repo.CourseRepository;
import com.database.in28minutes.repo.EmployeeRepository;
import com.database.in28minutes.repo.StudentRepository;

@SpringBootApplication
public class HibernateJpaIn100StepsApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	/*
	 * @Autowired PersonRepository personRepository;
	 */

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaIn100StepsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		
		employeeRepository.insertEmployee(new PartTimeEmployee("prabhas",new BigDecimal(100))) ;
		employeeRepository.insertEmployee(new FullTimeEmployee("prabhas",new BigDecimal(50))) ;
		
		List<Employee> allEmployees = employeeRepository.getAllEmployees();
		allEmployees.forEach(s -> log.info("list of employees"+ s));
		
		
		
		
		
		

	}
}
