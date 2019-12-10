package com.database.in28minutes.repo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.database.in28minutes.entity.Person;

@Repository
@Transactional
public class PersonRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public  List<Person> findAllPerson() {
		TypedQuery<Person> personNamedQuery = entityManager.createNamedQuery("all-Person", Person.class);
		List<Person> personCollect = personNamedQuery
									.getResultStream()
									.sorted(Comparator.comparing(Person::getName))
									.collect(Collectors.toList());
		return personCollect;
	}

	public Person findById(Long id) {

		return entityManager.find(Person.class, id);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public void delete(Long id) {
		Person personToDelete = findById(id);
		entityManager.remove(personToDelete);
	}
}
