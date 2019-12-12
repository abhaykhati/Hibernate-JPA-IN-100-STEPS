package com.database.in28minutes.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.database.in28minutes.entity.Course;
import com.database.in28minutes.entity.Review;

@Repository
@Transactional
public class CourseRepository {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EntityManager em;

	public Course findByID(Long id) {
		return em.find(Course.class, id);
	}

	public void addReviewsForCourse(Long courseId, List<Review> reviewsList) {
		/*	SELECT * FROM COURSE, REVIEW
			WHERE
			REVIEW.COURSE_ID =COURSE.ID */
		
		Course course = findByID(courseId);
		log.info("Review list for a Course=  " + course.getReviewList());
		for (Review review : reviewsList) {
			
			course.addReview(review);
			review.setCourse(course);
			em.persist(review);
		}
	}

	/*	public void deleteCourse(Long id) {
			Course courseToDelete = em.find(Course.class, id);
			em.remove(courseToDelete);
		}*/
	/*	public Course save(Course course) {
			if(course.getId()==null) {
				em.persist(course);
			}
			else {
				em.merge(course);
			}
			return course;
		}*/

	/*	public void playWithEntityManager() {
			
			Course course = new Course("REST WEbservices in 50 steps");
				em.persist(course);
				em.flush();
		}*/

}
