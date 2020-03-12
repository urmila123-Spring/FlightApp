package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exceptions.AirlineNotFoundException;
import com.example.model.Flight;
import com.example.repository.FlightRepository;

@Service

public class AirlineServiceImpl {
	
	@Autowired
	private FlightRepository airlineRepo;
	
	
	public Optional<Flight> getAirportById(int airportId) {
	Optional<Flight> ar=airlineRepo.findById(airportId);
	return ar;
	}

	
	public List<Flight> getAllAirports() {
		
		 List<Flight> e=airlineRepo .findAll();
		   if(e.size()==0) {
			   throw new  AirlineNotFoundException("Flight services are not available");
			   
		   }
	        return e;
	
	}

}
