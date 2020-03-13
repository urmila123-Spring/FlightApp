package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.daoImpl.PassengerServiceImpl;
import com.example.model.Passenger;

@RestController

@RequestMapping("passenger")
public class PassengerController {
	@Autowired
	PassengerServiceImpl passengerservice;
	private static final Logger logger = LoggerFactory.getLogger(PassengerController.class);
	
	
	@GetMapping("/getPassenger/{passengerid}")
	public @ResponseBody Optional<Passenger> getPassengerById(@PathVariable( "passengerid") Integer passengerid) {
   logger.info("Finding booking by id ... " + passengerid);
		return passengerservice.getPassengerById(passengerid);

	}
	
	
	@GetMapping("/getAllPassengers")
	public @ResponseBody List<Passenger> getAllBookingsByPassengerId() {
		return passengerservice.getAllPassengers();
	}

	

}
