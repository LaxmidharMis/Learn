package com.flightapp.user.ticket.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.user.ticket.entity.PassangerDetails;



public interface IPassangerDetailsRepostiory extends JpaRepository<PassangerDetails, Long> {

	List<PassangerDetails> findByPnrNumber(String pnrNumber);

	void deleteByPnrNumber(String pnrNumber);

}
