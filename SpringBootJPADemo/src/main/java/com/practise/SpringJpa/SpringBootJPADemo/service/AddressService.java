package com.practise.SpringJpa.SpringBootJPADemo.service;

import java.util.List;

import com.practise.SpringJpa.SpringBootJPADemo.entity.Address;

public interface AddressService {
	
	public List<Address> getAllAddressObjects();
	public Address getAddressDetailsById(int addressId);
	public Address updateDetails(Address address);
	public Address deleteDetails(int addressId);
	public Address addDetails(Address address);
}
