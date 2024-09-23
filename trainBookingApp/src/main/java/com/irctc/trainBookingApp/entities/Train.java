package com.irctc.trainBookingApp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table( name = "Train_Details")
@Data
public class Train {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long trainNumber;
	@NotNull(message = "This field must not be empty")
	private String name;
	@NotNull(message = "This field must not be empty")
	private String source;
	@NotNull(message = "This field must not be empty")
	private String destination;
	@Max(value = 500 , message = "Seat Count more than 500 no Train seats Available") 
	@Min(value = 0 , message = "Seat count cannot be zero")
	private int availableSeats;
	@OneToMany(mappedBy = "train")
private List<Booking> bookingDetails = new ArrayList<>();

	
	
	public Train() {
		super();
	}
	
	public Train(String name, String source, String destination, int availableSeats) {
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
	}
	
	

	
	
	
	
	
}
