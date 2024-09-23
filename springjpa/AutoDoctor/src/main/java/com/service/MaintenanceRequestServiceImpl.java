package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.entities.MaintenanceRequest;
import com.repository.MaintenanceRequestRepository;
import com.repository.VehicleRepository;
import com.exception.InvalidMaintenanceRequestException;
import com.exception.InvalidVehicleException;

@Service
public class MaintenanceRequestServiceImpl implements IMaintenanceRequestService {
	
    //Provide necessary annotation
	@Autowired
	private MaintenanceRequestRepository requestRepository;
	
	//Provide necessary annotation
	@Autowired
	private VehicleRepository vehicleRepository;
		
	@Override
	public MaintenanceRequest addRequest(MaintenanceRequest request, int vehicleId) throws InvalidVehicleException {
		return null;
	}

	@Override
	public MaintenanceRequest updateNotes(int requestId, String notes) throws InvalidMaintenanceRequestException{
		return null;
	}

	@Override
	public List<MaintenanceRequest> viewRequestsByMechanic(String assignedMechanic) {
		return null;
	}

	@Override
	public List<MaintenanceRequest> viewRequestsByLicencePlate(String licencePlateNumber) {
		return null;
	}

	@Override
	public MaintenanceRequest cancelRequest(int requestId) throws InvalidMaintenanceRequestException{
		return null;
	}

}
