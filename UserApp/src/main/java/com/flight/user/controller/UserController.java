package com.flight.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.user.entity.TicketBooking;
import com.flight.user.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/test")
	public String test() {
		return "Hello user..!!";
	}

	@PostMapping("/bookTicket")
	public TicketBooking bookTicket(@RequestBody TicketBooking ticket) {
		return userRepo.bookTicket(ticket);
	}
	

	@GetMapping("/searchTicket/{pnrNumber}")
	public TicketBooking findFlight(@PathVariable String pnrNumber) {
		return userRepo.findTicketByPnrNumber(pnrNumber);
	}

	@DeleteMapping("/cancelTicket")
	public String cancelTicket(@RequestBody TicketBooking ticket) {
		return userRepo.cancelTicekt(ticket);
	}

	@PutMapping("/rescheduleBooking")
	public String rescheduleBooking(@RequestBody TicketBooking ticket) {
		return userRepo.rescheduleBooking(ticket);

	}

}
