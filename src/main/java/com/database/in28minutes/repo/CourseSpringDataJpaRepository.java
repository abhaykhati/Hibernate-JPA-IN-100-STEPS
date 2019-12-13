package com.database.in28minutes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.in28minutes.entity.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
