package com.service;

import java.util.List;

import com.entities.MaintenanceRequest;
import com.entities.Vehicle;
import com.exception.InvalidMaintenanceRequestException;
import com.exception.InvalidVehicleException;

public interface IMaintenanceRequestService {
	public MaintenanceRequest addRequest(MaintenanceRequest request, int vehicleId) throws InvalidVehicleException;
	public MaintenanceRequest updateNotes(int requestId, String notes) throws InvalidMaintenanceRequestException;
	public List<MaintenanceRequest> viewRequestsByMechanic(String assignedMechanic);
	public List<MaintenanceRequest> viewRequestsByLicencePlate(String licencePlateNumber);
	public MaintenanceRequest cancelRequest(int requestId) throws InvalidMaintenanceRequestException;
}
