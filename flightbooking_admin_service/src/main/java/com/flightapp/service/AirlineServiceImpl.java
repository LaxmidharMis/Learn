package com.flightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Airline;
import com.flightapp.exception.ResourceNotFoundException;
import com.flightapp.repository.AirlineRepo;

@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	private AirlineRepo airlineRepo;

	@Override
	public Long addAirline(Airline airline) {
		Airline savedAirline = airlineRepo.save(airline);
		return savedAirline.getId();
	}

	@Override
	public List<Airline> getAllAirline() {
		return airlineRepo.findAll();
	}

	@Override
	public Airline getAirline(Long id) {
		return airlineRepo.findById(id).get();
	}

	@Override
	public void deleteAirline(Long id) {
		airlineRepo.deleteById(id);
	}

	@Override
	public Long updateAirline(Long id, Airline airline) {
		Airline exsitingAirline = airlineRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Airline", "id", id));
		airline.setId(exsitingAirline.getId());
//		exsitingAirline.setAirlineName(airline.getAirlineName());
//		exsitingAirline.setLogo(airline.getLogo());
//		exsitingAirline.setPhone(airline.getPhone());
//		exsitingAirline.setAddress(airline.getAddress());
//		exsitingAirline.setIsActive(airline.getIsActive());
		airlineRepo.save(airline);
		return exsitingAirline.getId();
	}

	@Override
	public Long enableAirline(Long id, Airline airline) {
		Airline exsitingAirline = airlineRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Airline", "id", id));
		exsitingAirline.setIsActive(true);
		airlineRepo.save(exsitingAirline);
		return exsitingAirline.getId();
	}

	@Override
	public Long disableAirline(Long id, Airline airline) {
		Airline exsitingAirline = airlineRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Airline", "id", id));
		exsitingAirline.setIsActive(false);
		airlineRepo.save(exsitingAirline);
		return exsitingAirline.getId();
	}
}
