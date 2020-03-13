package com.example.exceptions;

public class AirlineNotFoundException  extends RuntimeException{
	
	
	private static final long serialVersionUID = -4185306016942664972L;

	public AirlineNotFoundException (String msg) {
		super(msg);
	}


}
