package com.practise.SpringJpa.SpringBootJPADemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.practise.SpringJpa.SpringBootJPADemo.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{

}
