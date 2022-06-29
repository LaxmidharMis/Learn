package com.flightapp.controller;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Airline;
import com.flightapp.repository.AirlineRepo;
import com.flightapp.service.AirlineServiceImpl;

@SpringBootTest
public class AirlineControllerTest {
	
  	
  private AirlineServiceImpl airlineService;
  @Mock
  private AirlineRepo airlineRepo;
 
  private AirlineController airlineController;
  
	@BeforeEach
	void setUp() {
	   this.airlineService=new AirlineServiceImpl(this.airlineRepo);
	   this.airlineController=new AirlineController(this.airlineService);
	}
	
  
  @Test
  void getAllAirline() {
	  airlineService.getAllAirline();
	  airlineController.getAllAirline();
  }

	

}
