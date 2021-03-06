package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity 
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId; 
	@ManyToMany(mappedBy = "flights", fetch = FetchType.LAZY)
	private Set<Flightbooking> flightbooking;
	
	public Set<Flightbooking> getFlightbooking() {
		return flightbooking;
	}

	public void setFlightbooking(Set<Flightbooking> flightbooking) {
		this.flightbooking = flightbooking;
	}

	private String airlineName;

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	@Override
	public String toString() {
		return "Flight [airlineId=" + airlineId + ", flightbooking=" + flightbooking + ", airlineName=" + airlineName
				+ "]";
	}


}
