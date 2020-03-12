package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity 
@Table(name ="flightbooking")

public class Flightbooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@ManyToMany(mappedBy = "flightbookings", fetch = FetchType.LAZY)
	private Set<Flight> flights;
	

	@ManyToOne
	private Passenger passenger;
    
	private int flightbookingId;
	private int airlineId;
	
	private int passengerId;
	
	private String source;
	
	private String destination;
	
	private Date journeyDatetime;

	public int getFlightbookingId() {
		return flightbookingId;
	}

	public void setFlightbookingId(int flightbookingId) {
		this.flightbookingId = flightbookingId;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
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

	public Date getJourneyDatetime() {
		return journeyDatetime;
	}

	public void setJourneyDatetime(Date journeyDatetime) {
		this.journeyDatetime = journeyDatetime;
	}

	@Override
	public String toString() {
		return "Flightbooking [flightbookingId=" + flightbookingId + ", airlineId=" + airlineId + ", passengerId="
				+ passengerId + ", source=" + source + ", destination=" + destination + ", journeyDatetime="
				+ journeyDatetime + "]";
	}
	
	
	
	
	
	

}
