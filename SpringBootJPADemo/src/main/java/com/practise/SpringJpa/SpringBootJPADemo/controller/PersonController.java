package com.practise.SpringJpa.SpringBootJPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practise.SpringJpa.SpringBootJPADemo.entity.Person;
import com.practise.SpringJpa.SpringBootJPADemo.service.PersonService;


@RestController
public class PersonController {

	
		@Autowired
		private PersonService personService;
		
		public void setPersonService(PersonService personService) {
			this.personService = personService;
		}
		public PersonService getPersonService() {
			return personService;
		}
		@GetMapping("/person")
		public List<Person> getAllPersonObjects(){return personService.getAllPersonObjects();}
		@GetMapping("/person/{personId}")
		public Person getPersonalDetails(@PathVariable int personId) {return personService.getPersonalDetails(personId);}
		@PutMapping("/person")
		public Person updateDetails(@RequestBody Person person) {return personService.updateDetails(person);}
		@DeleteMapping("person/{personID}")
		public Person deleteDetails(@PathVariable int personID) {return personService.deleteDetails(personID);}
		@PostMapping("/person")
		public Person addDetails(@RequestBody Person person) {return personService.addDetails(person);}
		
		
}
