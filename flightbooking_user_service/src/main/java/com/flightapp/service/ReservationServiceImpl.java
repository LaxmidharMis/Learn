package com.flightapp.service;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flightapp.dto.ReservationRequest;
import com.flightapp.entity.Flight;
import com.flightapp.entity.Passenger;
import com.flightapp.entity.Reservation;
import com.flightapp.repository.FlightRepo;
import com.flightapp.repository.PassengerRepo;
import com.flightapp.repository.ReservationRepo;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepo flightRepo;
	@Autowired
	ReservationRepo reservationRepo;
	@Autowired
	PassengerRepo passengerRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request, Long id) {
		//Make payment
		Flight flight = flightRepo.findById(id).get();
		
		//save Passenger Details
		Passenger passenger=new Passenger();
		passenger.setName(request.getPassengerName());
		passenger.setGender(request.getPassengerGender());
		passenger.setMeal(request.getMeal());
		passenger.setAge(request.getAge());
		passenger.setPhone(request.getPassengerPhone());
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setEmail(request.getEmail());
		reservation.setPnr(new Random().nextInt(99999999));
		reservation.setPassenger(savedPassenger);
		reservation.setFlight(flight);
		Reservation savedReservation = reservationRepo.save(reservation);	
		return savedReservation;
	}

	@Override
	public List<Reservation> bookingHistory(String email) {	
		return reservationRepo.findByEmail(email);
	}

	@Override
	public Reservation findTicket(Integer pnr) {
		return reservationRepo.findByPnr(pnr);
	}

	@Override
	public void deteleTicket(Integer pnr) {
		Reservation reservation = reservationRepo.findByPnr(pnr);
		reservationRepo.deleteById(reservation.getId());
	}

	@Override
	public Reservation lastTicketDeatils() {
		List<Reservation> tickets = reservationRepo.findAll();
		Reservation reservation = tickets.get(tickets.size()-1);
		return reservation;
	}

	@Override
	public void deteleTicketId(Long id) {
        reservationRepo.deleteById(id);		
	}

}
