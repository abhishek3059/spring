package com.practise.SpringJpa.SpringBootJPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.practise.SpringJpa.SpringBootJPADemo.entity.Address;
import com.practise.SpringJpa.SpringBootJPADemo.service.AddressService;

@RestController
public class AddressController {
			
	
		@Autowired
		private AddressService addressService;
		
		
		
		
		
		@GetMapping("/address")
		public List<Address> getAllPersonObjects(){return addressService.getAllAddressObjects();}
		@GetMapping("/address/{addressId}")
		public Address getPersonalDetails(@PathVariable int addressId) {return addressService.getAddressDetailsById(addressId);}
		@PutMapping("/address")
		public Address updateDetails(@RequestBody Address address) {return addressService.updateDetails(address);}
		@DeleteMapping("address/{addressId}")
		public Address deleteDetails(@PathVariable int addressId) {return addressService.deleteDetails(addressId);}
		@PostMapping("/address")
		public Address addDetails(@RequestBody Address address) {return addressService.addDetails(address);}
}
