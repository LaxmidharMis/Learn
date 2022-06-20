package com.flightapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Flight;
import com.flightapp.repository.FlightRepo;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepo flightRepo;

	@Override
	public Long addFlight(Flight flight) {
		Flight savedFlight = flightRepo.save(flight);
 		return savedFlight.getId();
	}

}
