package com.flighatapp.admin.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.admin.entity.AirLine;

public interface IAirLineRepostiory extends JpaRepository<AirLine, Long>{

	List<AirLine> findByAirlineName(String airLineName);

	AirLine findByAirlineCode(String airlineCode);

}
