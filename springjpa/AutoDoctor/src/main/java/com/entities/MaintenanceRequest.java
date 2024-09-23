package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class MaintenanceRequest {
	//Provide necessary Annotation 
	@Id
	private int requestId;
	@Column(length=25)
	private String serviceType;
	@Column(length=25)
	private String notes;
	@Column(length=25)
	private String assignedMechanic;
	@Column(length=25)
	private String serviceStatus;
	private int estimatedHours;
	
	// Provide necessary Annotations
	@ManyToOne
	@JoinColumn(name ="vehicle_id")
	private Vehicle vehicleObj;
	
	public MaintenanceRequest() {
		super();
	}

}
