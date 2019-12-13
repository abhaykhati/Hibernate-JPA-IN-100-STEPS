package com.database.in28minutes.courseRepository;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

import com.database.in28minutes.HibernateJpaIn100StepsApplication;
import com.database.in28minutes.entity.Course;
import com.database.in28minutes.repo.CourseSpringDataJpaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateJpaIn100StepsApplication.class)

public class CourseSpringDataJpaRepositoryTest {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = true)
	CourseSpringDataJpaRepository courseDataJpaRepository;

	@Test
	public void findByID_If_Present() {
		Optional<Course> findById = courseDataJpaRepository.findById(14L);
		log.info("Course Name=  " + findById.isPresent());
	}

	@Test
	public void findByID_If_Not_Present() {
		Optional<Course> findById = courseDataJpaRepository.findById(18L);
		log.info("Course Name=  " + findById.isPresent());
	}

	@Test
	public void SortAllCourses() {

		log.info("Couse Count=  " + courseDataJpaRepository.count());

		log.info(
				"All Courses sorted DESC order =  " + courseDataJpaRepository.findAll(Sort.by(Direction.DESC, "name")));

	}

	@Test
	public void paginate_Courses() {
		PageRequest pageRequest = PageRequest.of(0, 4);
		Page<Course> firstPage = courseDataJpaRepository.findAll(pageRequest);
		log.info("Fist PAGE =  " + firstPage.getContent());

		Pageable secondPagable = firstPage.nextPageable();
		Page<Course> secondPage = courseDataJpaRepository.findAll(secondPagable);
		log.info("Second Page=   " + secondPage.getContent());
	}
}
