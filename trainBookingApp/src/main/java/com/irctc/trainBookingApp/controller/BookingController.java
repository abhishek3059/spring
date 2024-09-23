package com.irctc.trainBookingApp.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.trainBookingApp.customExceptions.BookingNotFoundException;
import com.irctc.trainBookingApp.customExceptions.NoAvailableSeatsOnTrain;
import com.irctc.trainBookingApp.customExceptions.PassengerAlreadyExistsException;
import com.irctc.trainBookingApp.customExceptions.PassengerNotFoundException;
import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;
import com.irctc.trainBookingApp.entities.Booking;
import com.irctc.trainBookingApp.entities.Passenger;
import com.irctc.trainBookingApp.entities.Train;
import com.irctc.trainBookingApp.service.BookingService;
import com.irctc.trainBookingApp.service.PassengerService;
import com.irctc.trainBookingApp.service.TrainService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@RestController
@Data
@Component
@RequestMapping("/api")
public class BookingController {
	


    private  BookingService bookingService;
    private  PassengerService passengerService;
    private  TrainService trainService;

	@GetMapping("/trains")
	public ResponseEntity<ArrayList<Train>> getAllTrains() throws TrainNotFoundException{
		ArrayList<Train> trains = trainService.getAllTrainObjs();
		return new ResponseEntity<ArrayList<Train>>(trains,HttpStatus.OK);
			
	}
	@GetMapping("/passengers")
	public ResponseEntity<ArrayList<Passenger>> getAllPassengers()throws PassengerNotFoundException{
		ArrayList<Passenger> passengers = passengerService.getAllPassengers();
		return new ResponseEntity<ArrayList<Passenger>>(passengers,HttpStatus.OK);
	}
	
	@GetMapping("/bookings/{passengerId}")
	public ResponseEntity<Optional<Booking>> getBookingByPassengerId(@PathVariable("passengerId") @Valid long id) throws BookingNotFoundException{
		Optional<Booking> booking = bookingService.GetBookingById(id);
		return new ResponseEntity<Optional<Booking>>(booking,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/trains")
	public ResponseEntity<Train> addNewTrain(@RequestBody Train train ) throws TrainNotFoundException{
		Train train1 = trainService.addTrain(train);
		return new ResponseEntity<Train>(train1,HttpStatus.ACCEPTED);
		 
	}
	
	@PostMapping("/passengers")
	public ResponseEntity<Passenger> addNewPassenger(@RequestBody Passenger passenger ) throws PassengerAlreadyExistsException{
		Passenger passenger1 = passengerService.register(passenger);
		return new ResponseEntity<Passenger>(passenger1,HttpStatus.CREATED);
	}
	
	@PostMapping("/bookings")
	public ResponseEntity<Booking> bookTicket	
			(
			 @NotNull(message = "This field must not be empty")		
			 @Valid @RequestParam
			 long trainNumber,
			 @NotNull(message = "This field must not be empty")
			 @RequestBody 
			 Passenger passenger, 
			 @NotNull(message = "noOfTickets Cannot be null")
			 int noOfTickets
			 )
			throws NoAvailableSeatsOnTrain, PassengerNotFoundException, TrainNotFoundException{
		
		Booking booking = bookingService.addBooking(trainNumber, passenger, noOfTickets);
		return new ResponseEntity<Booking>(booking,HttpStatus.CREATED);
		
		
	}
	
	
	@PutMapping("/trains/{trainNumber}")
	public ResponseEntity<String> updateTrain(@PathVariable @NotNull(message = "This field must not be empty") long trainNumber)throws TrainNotFoundException {
		 trainService.updateTrain(trainNumber);
		return new ResponseEntity<String>("Updated train details with "+trainNumber+".",HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/trains/{trainNumber}")
	public ResponseEntity<Void> deleteTrain(@PathVariable @Valid @NotNull(message = "This field must not be empty") long trainNumber )throws TrainNotFoundException{
		trainService.deleteTrain(trainNumber);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/bookings/{BookingId}")
	public ResponseEntity<Void> deleteBooking(@PathVariable @Valid @NotNull(message = "This field must not be empty") long BookingId) throws BookingNotFoundException{
		 bookingService.deleteYourBooking(BookingId);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	
	

}
