package com.employee.exceptions;

public class BookingNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -3880429246973279969L;

	public BookingNotFoundException(String bookingId) {
		super(bookingId);
	}
}

