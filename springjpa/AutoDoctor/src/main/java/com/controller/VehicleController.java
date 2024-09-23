package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Vehicle;
import com.exception.InvalidVehicleException;
import com.service.IVehicleService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class VehicleController {
    
		// Provide necessary Annotation
	@Autowired
		private IVehicleService vehicleService;
		
		// Provide necessary Annotation for the below methods and fill the code
	    @PostMapping("/addVehicle")
		public ResponseEntity<Vehicle> addVehicle(@Valid @RequestBody Vehicle vehicle){
			return new ResponseEntity<Vehicle>(vehicleService.addVehicle(vehicle),HttpStatus.OK);
		}
		
	
	    @GetMapping("/viewVehicleById/{vehicleId}")
		public ResponseEntity<Vehicle> viewVehicleById(@PathVariable int vehicleId) throws InvalidVehicleException{
			return new ResponseEntity<Vehicle>(vehicleService.viewVehicleById(vehicleId),HttpStatus.OK);
		}
        
	    @PutMapping("/updateOwnerContactNumber/{vehicleId}/{contactNumber}")
		public ResponseEntity<Vehicle> updateOwnerContactNumber(@PathVariable int vehicleId,@PathVariable String contactNumber) throws InvalidVehicleException{
			return new ResponseEntity<Vehicle>(vehicleService.updateOwnerContactNumber(vehicleId, contactNumber),HttpStatus.OK);
		}
		
		
	    @GetMapping("viewVehiclesByYear/{lowLimit}/{highLimit}")
		public ResponseEntity<List<Vehicle>> viewVehiclesByYear(@PathVariable int lowLimit, @PathVariable int highLimit) throws InvalidVehicleException{	 	  	      	 	    	      	    	      	 	
			return new ResponseEntity<List<Vehicle>>(vehicleService.viewVehiclesByYear(lowLimit, highLimit),HttpStatus.OK);
		}
		

	    @GetMapping ("/getRequestCountVehicleWise")
		public ResponseEntity<Map<Integer, Integer>> getRequestCountVehicleWise(){	 	  	      	 	    	      	    	      	 	
			return new ResponseEntity<Map<Integer,Integer>>(vehicleService.getRequestCountVehicleWise(),HttpStatus.OK);
		}
}
