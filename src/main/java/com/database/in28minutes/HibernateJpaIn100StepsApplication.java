package com.database.in28minutes;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.in28minutes.entity.Course;
import com.database.in28minutes.entity.Review;
import com.database.in28minutes.entity.Student;
import com.database.in28minutes.repo.CourseRepository;
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
	StudentRepository  studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaIn100StepsApplication.class, args);

	}
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Review> reviewList=new ArrayList<Review>();
		reviewList.add(new Review(3L,"Ghanta Course"));
		reviewList.add(new Review(2L,"Bakwas Course"));
		
		//courseRepository.addReviewsForCourse(12L, reviewList);
		//	studentRepository.saveStudentWithPassport();
		Student student=new Student();
		student.setName("Hrishi");
		
		Course course = new Course();
		course.setName("Rabbit-MQ-10-STEPS");
		
		studentRepository.insert_Student_And_Courses(student, course);
	}
	

	/*@Override
	public void run(String... args) throws Exception {
		
		log.info(" Person name for 101 id=  "+ personRepository.findById(101L));
		log.info("inserting NEW PERSON=  "+personRepository.insert(new Person("Hrushikesh", "Gondia", new Date())));
		log.info("updating  PERSON=  "+personRepository.update(new Person(1L,"HrushiPithi", "Gondia", new Date())));
		//log.info("All  PERSON=  "+ personRepository.findAllPerson().stream().distinct().sorted());
		//log.info("ALL PERSON NAME=   "+personRepository.findAllPerson());
		List<Person> findAllPerson = personRepository.findAllPerson();
		for(Person per:findAllPerson) {
			log.info(per.getId().toString()+"  "+ per.getName()+" "+ per.getLocation());
			
		}*/
		
		
		//personRepository.delete(102L);
	}
	
