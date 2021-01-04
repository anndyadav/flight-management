package com.flightmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagement.entity.Airport;
import com.flightmanagement.exception.FlightMgtException;
import com.flightmanagement.service.AirportService;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
	
	@Autowired
	AirportService airportService;
	
	@GetMapping
	public ResponseEntity<List<Airport>> findAll() {
		List<Airport> airports = airportService.findAll();
		if(airports==null || airports.isEmpty()) 
			throw new FlightMgtException("airport not found!");
			
		return new ResponseEntity<List<Airport>>(airports, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@GetMapping("/filter/{id}")
	public Optional<Airport> filterById(@PathVariable int id){
		return airportService.findById(id);
	}
	
	@PutMapping("/addairport")
	public Airport addAirport(@RequestBody Airport airport){
		return airportService.addAirport(airport);
	}
}
