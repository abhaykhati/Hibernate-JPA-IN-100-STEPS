package com.database.in28minutes.repo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.database.in28minutes.entity.Passport;
import com.database.in28minutes.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	private EntityManager em;

	/*	public Student findByID(Long id) {
			return em.find(Student.class, id);
		}
	
		public void deleteStudent(Long id) {
			Student studentToDelete = em.find(Student.class, id);
			em.remove(studentToDelete);
		}*/

	public void saveStudentWithPassport() {
		// First save passport and then student since it is a child table 
		Passport passport = new Passport();
		passport.setNumber("Rtg8998");
		em.persist(passport);

		Student student = new Student();
		student.setName("Vishant");
		student.setPassport(passport);
		em.persist(student);

	}

}
