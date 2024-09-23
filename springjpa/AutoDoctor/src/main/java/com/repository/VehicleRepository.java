package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Vehicle;//might have to remove

//Provide necessary annotation
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	//Provide necessary methods to view vehicles by year and to get the request count vehicle wise
	 
}
