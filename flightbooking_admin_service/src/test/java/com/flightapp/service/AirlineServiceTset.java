package com.flightapp.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Airline;
import com.flightapp.repository.AirlineRepo;

@SpringBootTest
public class AirlineServiceTset {
	@Mock
	private AirlineRepo airlineRepo;
	
	private AirlineServiceImpl airlineService;
	
	@BeforeEach
	void setUp() {
	   this.airlineService=new AirlineServiceImpl(this.airlineRepo);
	}
	
	@Test
	void testGetAllAirline() {
		airlineService.getAllAirline();
	      verify(airlineRepo).findAll();
	}
	
	@Test
	void testDeleteAirline() {
		doNothing().when(airlineRepo).deleteById(1L);
		airlineService.deleteAirline(1L);
		verify(airlineRepo).deleteById(1L);
	}
	
	@Test
	void testAddAirline() {
		Airline airline = new Airline("Air Asai", "airsai.png", "12344455","Mumbai",true);
		airlineService.addAirline(airline);
		verify(airlineRepo).save(airline);
	}
}
