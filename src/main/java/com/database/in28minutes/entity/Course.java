package com.database.in28minutes.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@NamedQueries(value = { 
		@NamedQuery(name = "query_to_get_all_courses", 
				query = "Select  c  From Course c"),	
		
		@NamedQuery(name = "query_get_all_courses_using_Typed_Query_And_Class", 
		query = "select c from Course c"),	
		
		@NamedQuery(name = "query_get_100_Step_courses", 
		query = "Select  c  From Course c where name like '%100 STEPS' ") })

@Table(name = "Course")
public class Course {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "course")
	private List<Review> reviewList=new ArrayList<>();
	
	@UpdateTimestamp // Annotation from HIBERNATE library
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp //Annotation from HIBERNATE library
	private LocalDateTime createdDate;
	
	@ManyToMany(mappedBy = "course")
	private List<Student> student=new ArrayList<Student>();
	
	
	
	
	public List<Student> getListOfStudnets() {
		return student;
	}


	public void setStudnets(Student Studnet) {
		student.add(Studnet);
	}
	


	public Course() {
		
	}
	

	public List<Review> getReviewList() {
		return reviewList;
	}

	public void addReview(Review review) {
		this.reviewList.add(review);
		
	}
	public void removeReview(Review review) {
		this.reviewList.remove(review);
		
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
