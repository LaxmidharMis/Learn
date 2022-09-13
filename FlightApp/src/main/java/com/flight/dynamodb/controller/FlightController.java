package com.flight.dynamodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dynamodb.entity.Flight;
import com.flight.dynamodb.repo.FlightRepo;

@RestController
public class FlightController {


	@Autowired
	private FlightRepo flightRepo;
	
	@GetMapping("/test")
	public String test() {
		return "Hello Flight user..!!";
	}

	@PostMapping("/saveFlight")
	public Flight saveFligt(@RequestBody Flight flight) {
		return flightRepo.addFlight(flight);
	}
	

	@GetMapping("/getFlight/{id}")
	public Flight findFlight(@PathVariable String id) {
		return flightRepo.findFlightById(id);
	}

	@DeleteMapping("/deleteFlight")
	public String deleteFlight(@RequestBody Flight flight) {
		return flightRepo.deleteFlight(flight);
	}

	@PutMapping("/updateFlight")
	public String updateFlight(@RequestBody Flight flight) {
		return flightRepo.editFlight(flight);

	}

}
