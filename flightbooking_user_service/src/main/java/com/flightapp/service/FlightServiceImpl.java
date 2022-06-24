package com.flightapp.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Airline;
import com.flightapp.entity.Flight;
import com.flightapp.repository.AirlineRepo;
import com.flightapp.repository.FlightRepo;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepo flightRepo;
	@Autowired
	private AirlineRepo airlineRepo;

	@Override
	public List<Flight> searchFlight(String dateOfDeparture, String departureCity, String arrivalCity)
			throws Exception {
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateOfDeparture);
		 List<Flight> flights = flightRepo.findByDateOfDepartureAndDepartureCityAndArrivalCity(date, departureCity, arrivalCity);
		 List<Flight> filterFlights=new ArrayList<>();
		 for(Flight flight:flights) {
			 Airline airline = airlineRepo.findByAirlineName(flight.getAirlineName());
			 if(airline.getIsActive()==true) {
				 filterFlights.add(flight);
			 }
		 }
		 return filterFlights;
	}

}
