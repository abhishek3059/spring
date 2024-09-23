package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.MaintenanceRequest;//might have to remove

//Provide necessary annotation
@Repository

public interface MaintenanceRequestRepository extends JpaRepository<MaintenanceRequest, Integer> {
	//Provide necessary methods to view requests by mechanic, and license plate number
	
}
