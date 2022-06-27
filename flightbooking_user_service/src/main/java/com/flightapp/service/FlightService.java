package com.flightapp.service;

import java.util.List;
import com.flightapp.entity.Flight;

public interface FlightService {

	List<Flight> searchFlight(String dateOfDeparture, String departureCity, String arrivalCity) throws Exception;

	public Flight getFlight(Long id);

}
