package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
