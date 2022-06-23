package com.flightapp.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flightapp.entity.Flight;
import com.flightapp.service.FlightServiceImpl;

@RestController
@RequestMapping("/admin")
public class FlightController {
	@Autowired
	private FlightServiceImpl flightService;

	@PostMapping("/addFlight")
	public String addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		System.out.println(flight.getEstimatedDepartureTime());
		return "Flight added successfully";
	}

	@GetMapping("/flight/{id}")
	public Flight getFlight(@PathVariable Long id) {
		return flightService.getFlight(id);
	}

	@GetMapping("/allFlights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}

	@DeleteMapping("/deleteFlight/{id}")
	public ResponseEntity<Flight> deleteFlight(@PathVariable Long id) {
		ResponseEntity<Flight> responseEntity = new ResponseEntity<Flight>(HttpStatus.OK);
		try {
			flightService.deleteFlight(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@PutMapping("/updateFlight/{id}")
	public ResponseEntity<Flight> updateAirline(@PathVariable Long id,@RequestBody Flight flight){
		ResponseEntity<Flight> responseEntity=new ResponseEntity<>(HttpStatus.OK);
		try {
			flightService.updateFlight(id, flight);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity=new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;	
	}
	
	@GetMapping("/searchFlight/{dateOfDeparture}/{departureCity}/{arrivalCity}")
	public ResponseEntity<?> searchFlight(@PathVariable String dateOfDeparture,@PathVariable String departureCity,@PathVariable String arrivalCity ) throws Exception{ 
		List<Flight> flights = flightService.searchFlight(dateOfDeparture, departureCity, arrivalCity);
		if(flights.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Flight not found");
		}
		return 	ResponseEntity.ok(flights);
	}
	
}
