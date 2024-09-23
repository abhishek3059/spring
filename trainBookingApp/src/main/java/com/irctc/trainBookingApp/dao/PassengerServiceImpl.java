package com.irctc.trainBookingApp.dao;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.trainBookingApp.customExceptions.PassengerAlreadyExistsException;
import com.irctc.trainBookingApp.customExceptions.PassengerNotFoundException;
import com.irctc.trainBookingApp.entities.Passenger;
import com.irctc.trainBookingApp.repository.PassengerRepository;
import com.irctc.trainBookingApp.service.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public ArrayList<Passenger> getAllPassengers() throws PassengerNotFoundException {
		ArrayList<Passenger> passengerDetails = new ArrayList<>();
	    passengerRepository.findAll().forEach(passengerDetails::add);
	    if (passengerDetails.isEmpty()) {
			throw new PassengerNotFoundException("No Passengers on the train");
	    }
		return passengerDetails;

	}

	@Override
	public Passenger register(Passenger passenger) throws PassengerAlreadyExistsException {
		if (passengerRepository.existsById(passenger.getId())) {
			throw new PassengerAlreadyExistsException("Passenger with the ID " + passenger.getId() + " already exists");
		}
		 else
			return passengerRepository.save(passenger);
		
		 
				
		
		
	}

	@Override
	public Passenger getPassengerById(long id) throws PassengerNotFoundException {
	 return passengerRepository.findById(id)
				.orElseThrow(() -> new PassengerNotFoundException("No Passenger with the "+id+" exists"));
	 
	 
	}

	
	

}
