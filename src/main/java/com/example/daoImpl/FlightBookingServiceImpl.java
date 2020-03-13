package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.exceptions.BookingNotFoundException;
import com.example.model.Flightbooking;
import com.example.model.Passenger;
import com.example.repository.FightBookingRepository;
import com.example.repository.PassengerRepository;
@Service
public class FlightBookingServiceImpl {
	
   @Autowired
	private FightBookingRepository airlineRepo;

	@Autowired
	private PassengerRepository passengerRepo;

	
	
	public Optional<Flightbooking> getFlightById(int flightId) {
		Optional<Flightbooking> ar=airlineRepo.findById(flightId);
		return ar;
	}
	
	

	public List<Flightbooking> getAllBookingsByPassengerId(int passengerId) {
		List<Flightbooking> bookings = airlineRepo.findAll();
		if (CollectionUtils.isEmpty(bookings))
			throw new BookingNotFoundException("bookings are not found");
		return bookings;
	}
	
	
	public String  createBooking(Passenger pass) {
		passengerRepo.save(pass);
		return "booking done for  passenger";
		
	}

	
	
	


	

}
