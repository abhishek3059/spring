package com.irctc.trainBookingApp.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;



@Data
@Entity
@Table(name = "passenger_details", uniqueConstraints = {@UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "phoneNumber")})
public class Passenger {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@NotNull(message = "Phone number must not be empty")
	@Pattern(regexp = "(\\+91|91|0)?[7-9][0-9]{9}", message = "Invalid phone number")

	private String phoneNumber;
	@NotNull(message = "PassengerName must not be empty")
	private String passengerName;
	@NotNull(message = "Value must not be empty")
	@Min(value = 3 , message = "Value cannot be less than 3 ")
	@Max(value = 120, message = "Value cannot be greater than 120")
	private int age;
	
	

	public Passenger() {
		super();
	}


	public Passenger(@Pattern(regexp = "(+91|91|0)?[7-9][0-9]{9}") String phoneNumber, @NotNull String name,
			@NotNull @Min(3) @Max(120) int age) {
		super();
		this.phoneNumber = phoneNumber;
		this.passengerName = name;
		this.age = age;
	}
	

}
