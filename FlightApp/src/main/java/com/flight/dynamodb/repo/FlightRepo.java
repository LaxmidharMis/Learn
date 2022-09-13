package com.flight.dynamodb.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.flight.dynamodb.entity.Flight;

@Repository
public class FlightRepo {

	@Autowired
	private DynamoDBMapper mapper;

	public Flight addFlight(Flight flight) {
		mapper.save(flight);
		return flight;
	}

	public Flight findFlightById(String id) {
		return mapper.load(Flight.class, id);
	}

	public String deleteFlight(Flight flight) {
		mapper.delete(flight);

		return "Flight is removed..";
	}

	public String editFlight(Flight flight) {
		mapper.save(flight, buildExpression(flight));
		return "Flighted Updated successfully";
	}

	private DynamoDBSaveExpression buildExpression(Flight flight) {
		DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
		Map<String, ExpectedAttributeValue> expectedMap = new HashMap<>();
		expectedMap.put("id", new ExpectedAttributeValue(new AttributeValue().withS(flight.getId())));
		dynamoDBSaveExpression.setExpected(expectedMap);
		return dynamoDBSaveExpression;
	}
}
