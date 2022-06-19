package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
