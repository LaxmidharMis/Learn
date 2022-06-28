package com.flightapp.service;

import java.util.List;

import com.flightapp.dto.ReservationRequest;
import com.flightapp.entity.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request,Long id);
	
	public List<Reservation> bookingHistory(String email);
	
	public Reservation findTicket(Integer pnr);
	
	public void deteleTicket(Integer pnr);
	
	public void deteleTicketId(Long id);
	
	public Reservation lastTicketDeatils();

}
