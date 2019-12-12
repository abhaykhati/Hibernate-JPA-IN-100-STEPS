package com.database.in28minutes.courseRepository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.database.in28minutes.HibernateJpaIn100StepsApplication;
import com.database.in28minutes.entity.Course;
import com.database.in28minutes.repo.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateJpaIn100StepsApplication.class)

public class CourseRepositoryTest {
	//private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired(required = true)
	CourseRepository courseRepository;

	@Test
	public void test_FindByID() {
		 Course findByID = courseRepository.findByID(11L);
       assertEquals("JPA IN 50 STEPS", findByID.getName());		
	}

	
	/*  @Test
	  @DirtiesContext // to roll back the data deleted in the current context such as DB 
	  public void test_deleteById() { 
		  courseRepository.deleteCourse(102L);
	  assertEquals(null,courseRepository.findByID(12L));
	  }*/
	 
	
	/*@Test
	@DirtiesContext
	public void test_Save_Update() {
	//get a course
		Course course = courseRepository.findByID(1L);
		assertEquals("Microservies in 20 steps", course.getName());
		
	// update a course
		course.setName("RABBIT-MQ-IN 50 STEPS-UPDATED");
		courseRepository.save(course);
		
	//check the value 
		Course course2 = courseRepository.findByID(1L);
		assertEquals("RABBIT-MQ-IN 50 STEPS-UPDATED", course2.getName());
		
	}*/
}
