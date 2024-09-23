package com.practise.SpringJpa.SpringBootJPADemo.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String city;
	private String addressType;
	@Autowired
	private Person person;
	public Address() {
		super();
	}
	public Address(int addressId, String city, String addressType) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", addressType=" + addressType + ", person="
				+ person + "]";
	}
	
	
	
	
}
