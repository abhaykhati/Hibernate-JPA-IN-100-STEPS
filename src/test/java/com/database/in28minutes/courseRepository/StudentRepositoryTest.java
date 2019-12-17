package com.database.in28minutes.courseRepository;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.database.in28minutes.HibernateJpaIn100StepsApplication;
import com.database.in28minutes.entity.Course;
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
	public void get_Student_And_Courses() {
		Student student = em.find(Student.class, 101L);
		log.info("student name=  "+ student.getName());
		List<Course> listOfCourses = student.getListOfCourses();
		log.info("list of courses attached to student = "+listOfCourses);
		
	}  
	
	/*@Test
	@Transactional
	public void getStudentAndPassportDetails() {
		Student student = em.find(Student.class, 101L);
		log.info("Student Name=  "+ student.getName());
		
		 Passport number = student.getPassport();
		log.info("passport number=  "+number.getNumber());
	}
	
	@Test
	@Transactional
	public void getPassportAndStudentDetails() {
		Passport passport = em.find(Passport.class, 202L);
		log.info("passport number=  "+passport.getNumber());
		Student student = passport.getStudent();
		log.info("Name of the student=  "+student.getName());
	}*/
	
}
