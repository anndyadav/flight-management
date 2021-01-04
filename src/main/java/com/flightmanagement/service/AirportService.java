package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import com.flightmanagement.entity.Airport;

public interface AirportService {
	List<Airport> findAll();

	Optional<Airport> findById(int id);
	
	Airport addAirport(Airport airport);
}
