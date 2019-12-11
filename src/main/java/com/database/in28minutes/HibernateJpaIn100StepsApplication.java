package com.database.in28minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.in28minutes.repo.CourseRepository;
import com.database.in28minutes.repo.PersonRepository;

@SpringBootApplication
public class HibernateJpaIn100StepsApplication implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired  
	PersonRepository personRepository;
	
	@Autowired  
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaIn100StepsApplication.class, args);

	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
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
	
