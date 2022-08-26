package com.flightapp.user.ticket.service;

import java.util.List;

import com.flightapp.user.ticket.entity.PassangerDetails;
import com.flightapp.user.ticket.entity.TicketBooking;
import com.flightapp.user.ticket.entity.TicketBookingModel;

public interface TicketBookingService {

	TicketBooking ticketBookSave(TicketBookingModel ticketBookingModel);

	 List<PassangerDetails>  savePassangerDetails(TicketBookingModel ticketBookingModel);

	TicketBooking getTicketDetailsByPnr(String pnrNumber);

	List<PassangerDetails> getPassangersDetails(String pnrNumber);

	List<TicketBooking> getTicketDetailsByUserName(String userName);

	void deleteTicketDetailsByPNR(String pnrNumber);

	void deletePassangerByPNR(String pnrNumber);

	void deleteTicketDetailsById(Long ticketBookingId);

	void deletePassangerById(List<PassangerDetails> details);

}
