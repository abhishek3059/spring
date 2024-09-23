package com.irctc.trainBookingApp.service;

import java.util.ArrayList;



import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;
import com.irctc.trainBookingApp.entities.Train;

public interface TrainService{
	
	public ArrayList<Train> getAllTrainObjs() throws TrainNotFoundException;
	public Train addTrain(Train train) throws TrainNotFoundException;
	public Train updateTrain(long trainNumber) throws TrainNotFoundException;
	public void deleteTrain (long trainNumner) throws TrainNotFoundException;
	public Train trainByTrainNo(long trainNumber) throws TrainNotFoundException;

}
