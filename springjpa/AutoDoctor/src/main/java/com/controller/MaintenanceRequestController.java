package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.MaintenanceRequest;
import com.exception.InvalidMaintenanceRequestException;
import com.exception.InvalidVehicleException;
import com.service.IMaintenanceRequestService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class MaintenanceRequestController {
	
	// Provide necessary Annotation
	@Autowired
	private IMaintenanceRequestService requestService;
	
	// Provide necessary Annotation for the below methods and fill the code
	@PostMapping("/addRequest/{vehicleId}")
	public ResponseEntity<MaintenanceRequest> addRequest(@Valid @RequestBody MaintenanceRequest request,@PathVariable int vehicleId) throws InvalidVehicleException{
		return new ResponseEntity<MaintenanceRequest>(requestService.addRequest(request, vehicleId),HttpStatus.OK);
	}
	
	@PutMapping("/updateNotes/{requestId}/{notes}")
	public ResponseEntity<MaintenanceRequest> updateNotes(@PathVariable int requestId,@PathVariable String notes) throws InvalidMaintenanceRequestException{
		return new ResponseEntity<MaintenanceRequest>(requestService.updateNotes(requestId, notes),HttpStatus.OK) ;
	}
	
	@GetMapping("/viewRequestsByMechanic/{assignedMechanic}")
	public ResponseEntity<List<MaintenanceRequest>> viewRequestsByMechanic(@PathVariable String assignedMechanic) {
	    return new ResponseEntity<List<MaintenanceRequest>>(requestService.viewRequestsByMechanic(assignedMechanic), HttpStatus.OK);
	}
    
	@GetMapping("/viewRequestsByLicencePlate/{licencePlateNumber}")
	public ResponseEntity<List<MaintenanceRequest>> viewRequestsByLicencePlate(@PathVariable String licencePlateNumber) {
		return new ResponseEntity<List<MaintenanceRequest>>(requestService.viewRequestsByLicencePlate(licencePlateNumber),HttpStatus.OK);
	}
    
	@DeleteMapping("/cancelRequest/{requestId}")
	public ResponseEntity<MaintenanceRequest> cancelRequest(@PathVariable int requestId) throws InvalidMaintenanceRequestException{
		return new ResponseEntity<MaintenanceRequest>(requestService.cancelRequest(requestId),HttpStatus.OK);
	}
}
