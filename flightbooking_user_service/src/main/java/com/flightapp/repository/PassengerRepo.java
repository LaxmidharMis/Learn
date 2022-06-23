package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger,Long> {

}
