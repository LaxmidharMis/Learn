package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

}
