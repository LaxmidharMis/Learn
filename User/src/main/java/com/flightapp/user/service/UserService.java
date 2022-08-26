package com.flightapp.user.service;

import java.util.List;

import com.flightapp.user.entity.FlightDetails;
import com.flightapp.user.entity.SearchFlightDetails;
import com.flightapp.user.entity.SearchFlightModel;
import com.flightapp.user.entity.User;

public interface UserService {
	
	public User saveUser(User user);

	public SearchFlightDetails getSearchFlightList(SearchFlightModel searchFlightModel);

	List<SearchFlightModel> getSearchFlightforRound(SearchFlightModel searchFlightModel);

	public FlightDetails getFlightByFlightId(Long flightId);

}
