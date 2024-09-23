package com.practise.SpringJpa.SpringBootJPADemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.practise.SpringJpa.SpringBootJPADemo.dao.AddressRepository;
import com.practise.SpringJpa.SpringBootJPADemo.entity.Address;

public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAllAddressObjects() {
		List<Address> addressDetails = new ArrayList<>();
		addressRepository.findAll().forEach(addressDetails::add);
		return addressDetails;
		
	}

	@Override
	public Address getAddressDetailsById(int addressId) {
		var address = addressRepository.findById(addressId).orElse(null);
	 	return address;
		
	}

	@Override
	public Address updateDetails(Address address) {
		var obj = addressRepository.save(address);
		return obj ;
	}

	@Override
	public Address deleteDetails(int addressId) {
		var obj = addressRepository.findById(addressId).orElse(null);
		addressRepository.deleteById(addressId);
	    return obj;
	}

	@Override
	public Address addDetails(Address address) {
		 var obj = addressRepository.save(address);
		 return obj;
	} 
	
	

}
