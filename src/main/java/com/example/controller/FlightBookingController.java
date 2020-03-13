package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.daoImpl.FlightBookingServiceImpl;
import com.example.model.Flightbooking;
import com.example.model.Passenger;

@RestController
@RequestMapping("bookings")
public class FlightBookingController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(FlightBookingController.class);

	@Autowired
	private FlightBookingServiceImpl bookingService;


	@GetMapping("/getFlight/{flightbookingId}")
	public @ResponseBody Optional<Flightbooking> getBookingById(@PathVariable( "flightbookingId") Integer flightbookingId) {
   logger.info("Finding booking by id ... " + flightbookingId);
		return bookingService.getFlightById(flightbookingId);

	}
	
	
	
	@GetMapping("/getAllFlights/{passengerId}")
	public @ResponseBody List<Flightbooking> getAllBookingsByPassengerId(@PathVariable("passengerId") Integer passengerId) {
		return bookingService.getAllBookingsByPassengerId(passengerId);
	}
	
	
	
	
	
	public String createBooking(@RequestBody  Passenger pass) {
		return null;
		
	}

}
