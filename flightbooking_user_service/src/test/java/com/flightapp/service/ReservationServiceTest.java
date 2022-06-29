package com.flightapp.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.repository.FlightRepo;
import com.flightapp.repository.PassengerRepo;
import com.flightapp.repository.ReservationRepo;

@SpringBootTest
public class ReservationServiceTest {
	
	@Mock
	FlightRepo flightRepo;
	@Mock
	ReservationRepo reservationRepo;
	@Mock
	PassengerRepo passengerRepo;
	
	private ReservationServiceImpl reservationService;
	
	@BeforeEach
	void setUp() {
	   this.reservationService=new ReservationServiceImpl(this.flightRepo,this.reservationRepo,this.passengerRepo);
	}
	
	@Test
	void bookingHistory(){
		reservationService.bookingHistory("sadique78@gmail.com");
		   verify(reservationRepo).findByEmail("sadique78@gmail.com");
	}
	
	@Test
	void deleteTicketId() {
		doNothing().when(reservationRepo).deleteById(1L);
		reservationService.deteleTicketId(1L);
		verify(reservationRepo).deleteById(1L);
	}
	
	@Test
	void findTicket() {
		reservationService.findTicket(123);
	}
}
