package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="flightavailability")
public class Flightavailability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int flightAvailabilityId;
	private int userId;
	private int passengerId;
	private boolean availability;
	private String source;
	private String destination;
	public int getFlightAvailabilityId() {
		return flightAvailabilityId;
	}
	public void setFlightAvailabilityId(int flightAvailabilityId) {
		this.flightAvailabilityId = flightAvailabilityId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flightavailability [flightAvailabilityId=" + flightAvailabilityId + ", userId=" + userId
				+ ", passengerId=" + passengerId + ", availability=" + availability + ", source=" + source
				+ ", destination=" + destination + "]";
	}
		

}
