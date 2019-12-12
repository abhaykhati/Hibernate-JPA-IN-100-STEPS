package com.database.in28minutes.courseRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.database.in28minutes.HibernateJpaIn100StepsApplication;
import com.database.in28minutes.entity.Passport;
import com.database.in28minutes.entity.Student;
import com.database.in28minutes.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { HibernateJpaIn100StepsApplication.class})

public class StudentRepositoryTest {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired(required = true)
	StudentRepository studentRepository;
	
	@Autowired
	EntityManager em;
	
	@Test
	@Transactional
	public void getStudentPassportDetails() {
		Student student = em.find(Student.class, 101L);
		log.info("Student Name=  "+ student.getName());
		
		 Passport number = student.getPassport();
		log.info("passport number=  "+number.getNumber());
	}

}
