package com.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation wherever necessary
@Data
@Getter
@Setter
@AllArgsConstructor
@Entity 
public class Vehicle {
	
	//Provide necessary Annotation
	@Id
	private int vehicleId;
	@Column(length=25)
	private String ownerContactNumber;
	@Column(length=25)
	private String licencePlateNumber;
	private int registeredYear;
	@Column(length=25)
	private String vehicleType;
	
	// Provide necessary Annotations
	@OneToMany(mappedBy = "vehicleObj")
	private List<MaintenanceRequest> requestList;
	
	public Vehicle() {
		
	}
	

}
