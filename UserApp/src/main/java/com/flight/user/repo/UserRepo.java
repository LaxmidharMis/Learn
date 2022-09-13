package com.flight.user.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.flight.user.entity.TicketBooking;

@Repository
public class UserRepo {

	@Autowired
	private DynamoDBMapper mapper;
	
	public TicketBooking bookTicket(TicketBooking ticket) {
		mapper.save(ticket);
		return ticket;
	}
	
	public TicketBooking findTicketByPnrNumber(String pnrNumber) {
		return mapper.load(TicketBooking.class, pnrNumber);
	}
	
	public String cancelTicekt(TicketBooking ticket) {
		mapper.delete(ticket);

		return "Ticekt is cancelld..";
	}
	
	public String rescheduleBooking(TicketBooking booking) {
		mapper.save(booking, buildExpression(booking));
		return "Ticket is Rescheduled successfully";
	}

	private DynamoDBSaveExpression buildExpression(TicketBooking booking) {
		DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
		Map<String, ExpectedAttributeValue> expectedMap = new HashMap<>();
		expectedMap.put("pnrNumber", new ExpectedAttributeValue(new AttributeValue().withS(booking.getPnrNumber())));
		dynamoDBSaveExpression.setExpected(expectedMap);
		return dynamoDBSaveExpression;
	}

}
