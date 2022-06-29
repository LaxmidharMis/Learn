package com.flightapp.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Airline;
import com.flightapp.repository.AirlineRepo;

@SpringBootTest
public class AirlineRepoTest {
	
	@Autowired
	AirlineRepo airlineRepo;
	
	@Test
	void testFindByAirlineName() {
		Airline airline=new Airline("Go First","gofirst.png","12345678","Sakinaka",true);
		//airlineRepo.save(airline);
		Airline resultAirline = airlineRepo.findByAirlineName(airline.getAirlineName());
		assertThat(airline.getAirlineName()).isEqualTo(resultAirline.getAirlineName());
	}

}
