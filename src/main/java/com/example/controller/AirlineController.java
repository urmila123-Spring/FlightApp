	package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.daoImpl.AirlineServiceImpl;
import com.example.model.Flight;

@RestController
@RequestMapping("airline")
public class AirlineController {
	
	
	
	
	@Autowired
	private AirlineServiceImpl airServiceImpl;
	
//	private static final Logger logger = LoggerFactory.getLogger(AirportController.class);
	
	@GetMapping
	public @ResponseBody List<Flight> getAllAirports() {
		return airServiceImpl.getAllAirports();
	}

	@GetMapping("/{airlineId}")
	public @ResponseBody Optional<Flight> getAirportById(@PathVariable("airlineId") int airlineId) {
		return airServiceImpl.getAirportById(airlineId);
	}

}
