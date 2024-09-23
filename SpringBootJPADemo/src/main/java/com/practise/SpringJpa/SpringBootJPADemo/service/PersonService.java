package com.practise.SpringJpa.SpringBootJPADemo.service;

import java.util.List;

import com.practise.SpringJpa.SpringBootJPADemo.entity.Person;

public interface PersonService {
	
	
	public List<Person> getAllPersonObjects();
	public Person getPersonalDetails(int personId);
	public Person updateDetails(Person persion);
	public Person deleteDetails(int personID);
	public Person addDetails(Person person);
	
		
		
	
}
