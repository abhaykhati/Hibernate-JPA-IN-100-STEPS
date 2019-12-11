package com.database.in28minutes.courseRepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.database.in28minutes.HibernateJpaIn100StepsApplication;
import com.database.in28minutes.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateJpaIn100StepsApplication.class)
public class NativeQueriesTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	public void nativeQuery_to_getAllCourses() {
		Query query = em.createNativeQuery("select * from course", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("Native Query=   select * from course-> {}", resultList);
	}

	@Test
	public void native_Queries_With_Column_Position_Parameter() {
		Query query = em.createNativeQuery("select * from course where id=?",Course.class);
		query.setParameter(1, 105L);

		List<Course> resultList = query.getResultList();

		logger.info("Navtive Query With column position Parameter= select * from course where id=?  -> {}", resultList);
	}
	
	@Test
	public void native_Queries_With_Named_Parameter() {
		Query query = em.createNativeQuery("select * from course where id=:id",Course.class);
		query.setParameter("id", 105L);

		List<Course> resultList = query.getResultList();

		logger.info("Navtive Query With Column Name Parameter= select * from course where id=:id  -> {}", resultList);
	}
}
