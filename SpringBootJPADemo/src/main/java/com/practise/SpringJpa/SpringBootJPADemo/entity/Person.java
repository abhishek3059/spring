package com.practise.SpringJpa.SpringBootJPADemo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.springframework.beans.factory.annotation.Autowired;

import com.practise.Springrest.SpringBootRestDemo.entites.Course;
@Entity
@Table( name = "Details" ,schema = "person",
		uniqueConstraints = {
				@UniqueConstraint(name = "Personal Id :", columnNames = "id"),
				@UniqueConstraint(name = "Full Name", columnNames = "name"),
				@UniqueConstraint(name = "City", columnNames = "city" ),
				@UniqueConstraint(name = "Status", columnNames = "status" )
		}
		)
public class Person {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 private String name;
	 
	 private String city;
	 
	 private String status;
	 @Autowired
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "fk_address_id")
	 private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Person(String name, String city, String status) {
		super();
		this.name = name;
		this.city = city;
		this.status = status;
	}

	public Person() {
		super();
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}

//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}
//	 
	 


}
