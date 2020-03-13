package com.example.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity 


public class Flightbooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightbookingId;
	
	 @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	    @JoinTable(name = "booking_flights",
	    joinColumns = @JoinColumn(name="flightbooking_id"),
	    inverseJoinColumns = @JoinColumn(name="airline_id")
	    )
	 
	 private Set<Flight> flights;
		
    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    @JoinTable(name = "passenger_flights",
    joinColumns = @JoinColumn(name="flightbookingId"),
    inverseJoinColumns = @JoinColumn(name="passengerid")
    )
	
   private  List<Passenger> passenger;
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
