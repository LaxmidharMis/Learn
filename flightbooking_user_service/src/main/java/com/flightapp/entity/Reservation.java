package com.flightapp.entity;

public class Reservation {

	private Long id;
	private int noOfseat;
	private String onwardSeat;
	private String returnSeat;
	private String meal;
	private Passenger passenger;
	private Flight flight;

	public Reservation(Long id, int noOfseat, String onwardSeat, String returnSeat, String meal, Passenger passenger,
			Flight flight) {
		super();
		this.id = id;
		this.noOfseat = noOfseat;
		this.onwardSeat = onwardSeat;
		this.returnSeat = returnSeat;
		this.meal = meal;
		this.passenger = passenger;
		this.flight = flight;
	}

	public Reservation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNoOfseat() {
		return noOfseat;
	}

	public void setNoOfseat(int noOfseat) {
		this.noOfseat = noOfseat;
	}

	public String getOnwardSeat() {
		return onwardSeat;
	}

	public void setOnwardSeat(String onwardSeat) {
		this.onwardSeat = onwardSeat;
	}

	public String getReturnSeat() {
		return returnSeat;
	}

	public void setReturnSeat(String returnSeat) {
		this.returnSeat = returnSeat;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
