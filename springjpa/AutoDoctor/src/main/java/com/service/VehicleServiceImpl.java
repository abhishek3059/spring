package com.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.entities.Vehicle;
import com.repository.VehicleRepository;
import com.exception.InvalidVehicleException;


@Service
public class VehicleServiceImpl implements IVehicleService{
	
	// Provide necessary annotation
	private VehicleRepository vehicleRepository;

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle viewVehicleById(int vehicleId) throws InvalidVehicleException{
		return null;
	}

    @Override
	public Vehicle updateOwnerContactNumber(int vehicleId, String contactNumber) throws InvalidVehicleException{
		
			return null;
	}

	@Override
	public List<Vehicle> viewVehiclesByYear(int lowLimit, int highLimit) {
	
		return null;
	}


	@Override
	public Map<Integer, Integer> getRequestCountVehicleWise() {
	
		return null;
	}	 	

}
