package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Flightbooking;

public interface FightBookingRepository extends JpaRepository<Flightbooking, Integer> {

}
