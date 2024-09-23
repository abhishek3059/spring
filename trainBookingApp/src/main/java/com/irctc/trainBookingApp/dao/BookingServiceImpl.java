package com.irctc.trainBookingApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.trainBookingApp.customExceptions.BookingNotFoundException;
import com.irctc.trainBookingApp.customExceptions.NoAvailableSeatsOnTrain;
import com.irctc.trainBookingApp.customExceptions.PassengerNotFoundException;
import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;
import com.irctc.trainBookingApp.entities.Booking;
import com.irctc.trainBookingApp.entities.Passenger;
import com.irctc.trainBookingApp.entities.Train;
import com.irctc.trainBookingApp.repository.BookingRepository;
import com.irctc.trainBookingApp.repository.PassengerRepository;
import com.irctc.trainBookingApp.repository.TrainRepository;
import com.irctc.trainBookingApp.service.BookingService;

import lombok.Data;

@Service
@Data
public class BookingServiceImpl implements BookingService {

	
	private BookingRepository bookingRepository;
	private TrainRepository trainRepository;
	private PassengerRepository passengerRepository;

	

	

	@Override
	public Optional<Booking> GetBookingById(long id) throws  BookingNotFoundException {


	  bookingRepository.findById(id)
					.orElseThrow(() -> new BookingNotFoundException("Booking with id "+id+" not found"));	 
					return bookingRepository.findByPassengerId(id);

		

		

	}

	@Override
	public Booking deleteYourBooking(long id) throws BookingNotFoundException {
		
			Booking booking = bookingRepository.findById(id)
					.orElseThrow(() -> new BookingNotFoundException("Entered BookingId does not exists"));
			Train train = booking.getTrain();
			if(!train.getBookingDetails().isEmpty()){throw new IllegalStateException("Cannot delete a train with active bookings");}
			int seatsToBeUpdated = train.getAvailableSeats() + booking.getTicketBooked();
			if(seatsToBeUpdated > train.getAvailableSeats()) 
			throw new IllegalStateException("Available seats exceed maximum capacity");
			train.setAvailableSeats(seatsToBeUpdated);
			bookingRepository.deleteById(id);
			return booking;
		
	}

	@Override
	public Booking addBooking(long trainNumber, Passenger passenger, int noOfTicketsToBeBooked)
			throws NoAvailableSeatsOnTrain, PassengerNotFoundException, TrainNotFoundException {
		
			Train checkFortrain  = trainRepository.findById(trainNumber)
					.orElseThrow(() -> new TrainNotFoundException("Entered Train Number "+trainNumber+" does not exists"));
			Passenger checkForPassenger =  passengerRepository.findById(passenger.getId())
					.orElseThrow(() -> new PassengerNotFoundException("Passenger with "+ passenger.getId() +"does not exists"));
			if(checkFortrain.getAvailableSeats() < noOfTicketsToBeBooked) {
				throw new NoAvailableSeatsOnTrain("No Seats Available on Selected Train Try to book tickets on another train");
			}
			Booking newBooking = new Booking(checkFortrain, checkForPassenger, noOfTicketsToBeBooked);
Booking booking = bookingRepository.save(newBooking);

return booking;
			
		
		

		
	}

}
