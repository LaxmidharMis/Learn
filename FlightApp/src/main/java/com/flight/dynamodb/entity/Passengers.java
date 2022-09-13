package com.flight.dynamodb.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Passengers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@DynamoDBAttribute
	private String name;
	@DynamoDBAttribute
	private String email;
	@DynamoDBAttribute
	private int age;

	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passengers(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Passengers [name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
