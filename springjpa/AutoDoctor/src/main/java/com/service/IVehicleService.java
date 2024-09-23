package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Vehicle;
import com.exception.InvalidVehicleException;

public interface IVehicleService {

    public Vehicle addVehicle(Vehicle vehicle);
	public Vehicle viewVehicleById(int vehicleId) throws InvalidVehicleException;
	public Vehicle updateOwnerContactNumber(int vehicleId, String contactNumber) throws InvalidVehicleException;
	public List<Vehicle> viewVehiclesByYear(int lowLimit, int highLimit);
	public Map<Integer, Integer> getRequestCountVehicleWise();
}
