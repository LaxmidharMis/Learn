package com.flightapp.controller;

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

import com.flightapp.entity.Airline;
import com.flightapp.service.AirlineServiceImpl;

@RestController
@RequestMapping("/admin")
public class AirlineController {
	@Autowired
	private AirlineServiceImpl airlineSevice;

	@PostMapping("/addAirline")
	public String addAirline(@RequestBody Airline airline) {
		try {
			airlineSevice.addAirline(airline);
			return "Airline added successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Airline already added";
	}
	
	@GetMapping("/allAirline")
	public List<Airline> getAllAirline(){
		return airlineSevice.getAllAirline();	
	}
	
	@GetMapping("/airline/{id}")
	public Airline getAirline(@PathVariable Long id) {
		return airlineSevice.getAirline(id);		
	}
	
	@PutMapping("/updateAirline/{id}")
	public ResponseEntity<Airline> updateAirline(@PathVariable Long id,@RequestBody Airline airline){
		ResponseEntity<Airline> responseEntity=new ResponseEntity<>(HttpStatus.OK);
		try {
			airlineSevice.updateAirline(id, airline);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity=new ResponseEntity<Airline>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;	
	}
	
	@DeleteMapping("/deleteAirline/{id}")
	public ResponseEntity<Airline> deleteAirline(@PathVariable Long id){
		ResponseEntity<Airline> responseEntity=new ResponseEntity<Airline>(HttpStatus.OK);
		try {
			airlineSevice.deleteAirline(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity=new ResponseEntity<Airline>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;		
	}
}
