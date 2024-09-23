package com.practise.SpringJpa.SpringBootJPADemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.SpringJpa.SpringBootJPADemo.entity.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

	
	
}
