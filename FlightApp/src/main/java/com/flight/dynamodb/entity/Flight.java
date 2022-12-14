package com.flight.dynamodb.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "flight")
public class Flight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@DynamoDBHashKey(attributeName = "id")
	@DynamoDBAutoGeneratedKey
	private String id;
	@DynamoDBAttribute
	private String name;
	@DynamoDBAttribute
	private String destination;
	@DynamoDBAttribute
	private String source;
	@DynamoDBAttribute
	private double price;
	@DynamoDBAttribute
	private Passengers passengers;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(String id, String name, String destination, String source, double price, Passengers passengers) {
		super();
		this.id = id;
		this.name = name;
		this.destination = destination;
		this.source = source;
		this.price = price;
		this.passengers = passengers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Passengers getPassengers() {
		return passengers;
	}

	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", destination=" + destination + ", source=" + source
				+ ", price=" + price + ", passengers=" + passengers + "]";
	}

}
