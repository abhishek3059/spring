package com.irctc.trainBookingApp.service;

import java.util.Optional;

import com.irctc.trainBookingApp.customExceptions.BookingNotFoundException;
import com.irctc.trainBookingApp.customExceptions.NoAvailableSeatsOnTrain;
import com.irctc.trainBookingApp.customExceptions.PassengerNotFoundException;
import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;
import com.irctc.trainBookingApp.entities.Booking;
import com.irctc.trainBookingApp.entities.Passenger;

public interface BookingService {
 
	
	
	public Optional<Booking> GetBookingById(long id) throws  BookingNotFoundException;
 
 


	public Booking deleteYourBooking(long id) throws BookingNotFoundException;


	public Booking addBooking(long trainNumber, Passenger passenger, int ticketBooked)
										throws NoAvailableSeatsOnTrain, PassengerNotFoundException, TrainNotFoundException;
  
	  
  
}
