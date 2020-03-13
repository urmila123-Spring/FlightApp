package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.exceptions.BookingNotFoundException;
import com.example.exceptions.PassengerNotFoundException;
import com.example.model.Flightbooking;
import com.example.model.Passenger;
import com.example.repository.PassengerRepository;



@Service
public class PassengerServiceImpl  {
	
@Autowired
PassengerRepository passengerRepo;
	


	
	public Optional<Passenger> getPassengerById(int passengerId) {
		return passengerRepo.findById(passengerId);
	}
			
	
	
	
	public List<Passenger> getAllPassengers() {
		List<Passenger> bookings = passengerRepo.findAll();
		if (CollectionUtils.isEmpty(bookings))
			throw new PassengerNotFoundException("passenger are not found");
	

		return passengerRepo.findAll();
		
	}

	
	
	
	

}
