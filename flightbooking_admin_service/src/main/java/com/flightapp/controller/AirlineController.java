package com.flightapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.Airline;

@RestController
public class AirlineController {
	
	@PostMapping("/addAirline")
	public Airline addAirline(@RequestBody Airline airline) {
		
		return null;		
	}
 
}
