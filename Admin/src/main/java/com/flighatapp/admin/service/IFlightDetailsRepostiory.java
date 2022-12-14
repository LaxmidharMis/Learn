package com.flighatapp.admin.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.admin.entity.FlightDetails;

public interface IFlightDetailsRepostiory extends JpaRepository<FlightDetails, Long>{

	List<FlightDetails> findByFlightName(String flightName);

	List<FlightDetails> findByAirlineName(String airlineName);

}
