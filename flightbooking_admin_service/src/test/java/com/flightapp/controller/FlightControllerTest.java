package com.flightapp.controller;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.repository.AirlineRepo;
import com.flightapp.repository.FlightRepo;
import com.flightapp.service.AirlineServiceImpl;
import com.flightapp.service.FlightServiceImpl;

@SpringBootTest
public class FlightControllerTest {
	
	private FlightServiceImpl flightService;
	  @Mock
	  private FlightRepo flightRepo;
	  @Mock
	  private AirlineRepo airlineRepo;
	 
	  private FlightController flightController;
	  
		@BeforeEach
		void setUp() {
		   this.flightService=new FlightServiceImpl(this.flightRepo,this.airlineRepo);
		   this.flightController=new FlightController(this.flightService);
		}
		
	  
	  @Test
	  void getAllAirline() {
		  flightService.getAllFlights();
		  flightController.getAllFlights();
	  }
	  
	  @Test
	  void getFlight() {
		  flightService.getFlight(1L);
		  flightController.getFlight(1L);
	  }
	  
	  @Test
	  void deleteFlight() {
		  flightService.deleteFlight(1L);
		  flightController.deleteFlight(1L);
	  }

}
