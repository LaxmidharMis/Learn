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
		Boolean status;
		if (exsitingAirline.getIsActive() == true) {
			status=false;
			exsitingAirline.setPhone(airline.getPhone());
			exsitingAirline.setAddress(airline.getAddress());
			exsitingAirline.setIsActive(status);
			airlineRepo.save(exsitingAirline);
			return exsitingAirline.getId();
		}
		else if (exsitingAirline.getIsActive() == false) {
			status=true;
			exsitingAirline.setPhone(airline.getPhone());
			exsitingAirline.setAddress(airline.getAddress());
			exsitingAirline.setIsActive(status);
			airlineRepo.save(exsitingAirline);
			return exsitingAirline.getId();
		}
		return exsitingAirline.getId();
	}
}
