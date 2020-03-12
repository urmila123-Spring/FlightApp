package com.example.daoImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Flightbooking;
import com.example.repository.FightBookingRepository;

public class FlightBookingServiceImpl {
	
   @Autowired
	private FightBookingRepository airlineRepo;
	
	
	public Optional<Flightbooking> getFlightById(int flightId) {
		Optional<Flightbooking> ar=airlineRepo.findById(flightId);
		return ar;
	}


	

}
