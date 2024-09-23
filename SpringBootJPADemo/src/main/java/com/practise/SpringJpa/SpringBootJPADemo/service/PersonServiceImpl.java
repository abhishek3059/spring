package com.practise.SpringJpa.SpringBootJPADemo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.practise.SpringJpa.SpringBootJPADemo.dao.PersonRepository;
import com.practise.SpringJpa.SpringBootJPADemo.entity.Person;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
      
	
	
	@Override
	public List<Person> getAllPersonObjects() {
		List<Person> personalDetails = new ArrayList<>();
		personRepository.findAll().forEach(personalDetails::add);
		return personalDetails;
	}

	@Override
	public Person getPersonalDetails(int personId) {
		 var person = personRepository.findById(personId).orElse(null);
		 	return person;
	}

	@Override
	public Person updateDetails(@RequestBody Person person) {
			var obj = personRepository.save(person);
			return obj ;
	}

	@Override
	public Person deleteDetails(int personID) {
			var obj = personRepository.findById(personID).orElse(null);
		    personRepository.deleteById(personID);
		    return obj;
	}

	@Override
	public Person addDetails( Person person) {
		 var obj = personRepository.save(person);
		 return obj;
	}

	
}
