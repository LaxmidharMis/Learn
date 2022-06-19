package com.flightapp.entity;

import java.security.Timestamp;
import java.sql.Date;

public class Flight {

	private Long id;
	private String flightNumber;
	private String airline;
	private String departureCity;
	private String drrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;
	private Double price;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(Long id, String flightNumber, String airline, String departureCity, String drrivalCity,
			Date dateOfDeparture, Timestamp estimatedDepartureTime, Double price) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.departureCity = departureCity;
		this.drrivalCity = drrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getDrrivalCity() {
		return drrivalCity;
	}

	public void setDrrivalCity(String drrivalCity) {
		this.drrivalCity = drrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
