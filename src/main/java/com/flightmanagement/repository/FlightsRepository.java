package com.flightmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightmanagement.entity.Flights;

public interface FlightsRepository extends JpaRepository<Flights, Integer>{
	List<Flights> findByStartAndDestination(String start, String destination);
	List<Flights> findByStartCodeAndDestCode(int start, int destination);
}
