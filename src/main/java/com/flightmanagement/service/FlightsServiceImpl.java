package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagement.entity.Flights;
import com.flightmanagement.repository.FlightsRepository;

@Service
public class FlightsServiceImpl implements FlightsService {
	
	@Autowired
	FlightsRepository flightsRepository;
	
	@Override
	public List<Flights> findAll() {
		return flightsRepository.findAll();
	}

	@Override
	public Optional<Flights> findById(int id) {
		return flightsRepository.findById(id);
	}

	@Override
	public List<Flights> findFlightsBetweenPlaces(int from, int to) {
		return flightsRepository.findByStartCodeAndDestCode(from, to);
	}

}
