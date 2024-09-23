package com.irctc.trainBookingApp.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;
import com.irctc.trainBookingApp.entities.Train;
import com.irctc.trainBookingApp.repository.TrainRepository;
import com.irctc.trainBookingApp.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;

	@Override
	public ArrayList<Train> getAllTrainObjs() throws TrainNotFoundException {

		ArrayList<Train> trainDetails = new ArrayList<>();
		trainRepository.findAll().forEach(trainDetails::add);
		if (trainDetails.isEmpty())
			throw new TrainNotFoundException("No Trains To Display");
		return trainDetails;

	}

	@Override
	public Train updateTrain(long trainNumber) throws TrainNotFoundException {
		
		 Train train = trainRepository.findById(trainNumber)
				.orElseThrow(() -> new TrainNotFoundException("No Trains in DB with this number"));
	     trainRepository.save(train);
	     return train;
		

	}

	@Override
	public void deleteTrain(long trainNumber) throws TrainNotFoundException {
		

		if (!trainRepository.existsById(trainNumber)){
			 throw new TrainNotFoundException("No Trains in DB with this number");
		 }
		        trainRepository.deleteById(trainNumber);

	}

	@Override
	public Train trainByTrainNo(long trainNumber) throws TrainNotFoundException {
		return trainRepository.findById(trainNumber)
				.orElseThrow(() -> new TrainNotFoundException("No Trains in DB with this number"));
		

	}

	@Override
	public Train addTrain(Train train) throws TrainNotFoundException {
		if(trainRepository.existsById(train.getTrainNumber())){
			throw new TrainNotFoundException("Train with train number"+train.getTrainNumber() +" doesnt exists.");
		}
		
		
		trainRepository.save(train);
		return train;
	
	}

}
