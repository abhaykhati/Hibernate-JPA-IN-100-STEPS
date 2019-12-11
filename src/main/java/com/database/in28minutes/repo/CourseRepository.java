package com.database.in28minutes.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.database.in28minutes.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	private EntityManager em;
	
	public Course findByID(Long id) {
		return em.find(Course.class,id);
	}

	
	public void deleteCourse(Long id) {
		Course courseToDelete = em.find(Course.class, id);
		em.remove(courseToDelete);
	}
	public Course save(Course course) {
		if(course.getId()==null) {
			em.persist(course);
		}
		else {
			em.merge(course);
		}
		return course;
	}
	
	public void playWithEntityManager() {
		
		Course course = new Course("REST WEbservices in 50 steps");
			em.persist(course);
			em.flush();
	}
	
	
}
