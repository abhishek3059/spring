package com.irctc.trainBookingApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table( name = "Booking_Details", uniqueConstraints = {@UniqueConstraint(columnNames = "ticketNumber")})

public class Booking {
	@Id  @GeneratedValue(strategy = GenerationType.AUTO)
	private long ticketNumber;
	
	
		@ManyToOne
	    @JoinColumn(name = "train_id", nullable = false)
	    private Train train;
	    @ManyToOne
	    @JoinColumn(name = "passenger_id", nullable = false)
	    private Passenger passenger;
	    @Min(value = 1 , message = "At least one ticket must be booked")
	    private int ticketBooked;
	
	
	    public Booking(Train train, Passenger passenger, int ticketBooked) {
	    	this.train = train;
	    	this.passenger = passenger; 
	    	this.ticketBooked = ticketBooked;
	    }
	
	    @Override
	    public String toString() {
	        return "Booking [ticketNumber=" + ticketNumber +
	               ", Passenger Name=" + passenger.getPassengerName() +
	               ", Age=" + passenger.getAge() +
	               ", Train Name=" + train.getName() +
	               ", Source=" + train.getSource() +
	               ", Destination=" + train.getDestination() + "]";
	    }
	
		
}
