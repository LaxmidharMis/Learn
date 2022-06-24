package com.flightapp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Airline;
import com.flightapp.entity.Flight;
import com.flightapp.exception.ResourceNotFoundException;
import com.flightapp.repository.AirlineRepo;
import com.flightapp.repository.FlightRepo;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepo flightRepo;
	@Autowired
	private AirlineRepo airlineRepo;

	@Override
	public Long addFlight(Flight flight) {
		String airlineName = flight.getAirlineName();
		Airline airline = airlineRepo.findByAirlineName(airlineName);
		flight.setAirline(airline);
		Flight savedFlight = flightRepo.save(flight);
 		return savedFlight.getId();
	}

	@Override
	public Flight getFlight(Long id) {
		return flightRepo.findById(id).orElse(null);
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}

	@Override
	public void deleteFlight(Long id) {
		flightRepo.deleteById(id);
	}

	@Override
	public Long updateFlight(Long id, Flight flight) {
		Flight exsitingFlight = flightRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Flight", "id", id));
		flight.setId(id);
		flightRepo.save(flight);
		return exsitingFlight.getId();
	}

	@Override
	public List<Flight> searchFlight(String dateOfDeparture, String departureCity, String arrivalCity) throws Exception {	
		Date date=new SimpleDateFormat("dd-MM-yyyy").parse(dateOfDeparture);
		return flightRepo.findByDateOfDepartureAndDepartureCityAndArrivalCity(date, departureCity, arrivalCity);
	}
	
}
