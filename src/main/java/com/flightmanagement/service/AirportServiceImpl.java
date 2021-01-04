package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagement.entity.Airport;
import com.flightmanagement.repository.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService {
	
	@Autowired
	AirportRepository airportRepository;
	
	@Override
	public List<Airport> findAll() {
		return airportRepository.findAll();
	}

	@Override
	public Optional<Airport> findById(int id) {		 
		return airportRepository.findById(id);		
	}

	@Override
	public Airport addAirport(Airport airport) {
		return airportRepository.save(airport);
		
	}

}
