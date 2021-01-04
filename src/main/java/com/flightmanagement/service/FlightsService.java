package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import com.flightmanagement.entity.Flights;

public interface FlightsService {
	List<Flights> findAll();
	List<Flights> findFlightsBetweenPlaces(int from, int to);
	Optional<Flights> findById(int id);
}
