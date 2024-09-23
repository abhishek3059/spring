package com.irctc.trainBookingApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.trainBookingApp.entities.Booking;
import com.irctc.trainBookingApp.entities.Passenger;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    public Optional<Booking> findByPassengerId(long passengerId);
    public Optional<Booking> findByTrain(long trainNumber);  // Remove `throws`
    public Booking findByPassenger(Passenger passenger);
}
