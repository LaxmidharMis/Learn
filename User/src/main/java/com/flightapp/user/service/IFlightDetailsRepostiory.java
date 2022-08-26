package com.flightapp.user.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.user.entity.FlightDetails;



public interface IFlightDetailsRepostiory extends JpaRepository<FlightDetails, Long>{


	List<FlightDetails> findByStartPointAndEndPoint(String startPoint, String endPoint);

}
