package com.flightmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagement.entity.Flights;
import com.flightmanagement.exception.FlightMgtException;
import com.flightmanagement.service.FlightsService;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
	
	@Autowired
	FlightsService flightsService;
	
	@GetMapping
	public ResponseEntity<List<Flights>> findAll() {
		List<Flights> flights = flightsService.findAll();
		if(flights==null || flights.isEmpty()) 
			throw new FlightMgtException("provider not found!");
		//Flights flight = new Flights();
		flights.stream().filter(flight -> flight.getId()==1).forEach(flight -> System.out.println(flight.getArrival()));	
		return new ResponseEntity<List<Flights>>(flights, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/filter/{id}")
	public Optional<Flights> filterById(@PathVariable int id){
		return flightsService.findById(id);
	}
	
	@GetMapping("/filter/{from}/{to}")
	public ResponseEntity<List<Flights>> filterById(@PathVariable int from,@PathVariable int to){
		List<Flights> flights =  flightsService.findFlightsBetweenPlaces(from, to);
		if(flights==null || flights.isEmpty()) 
			throw new FlightMgtException("No Flights Found");
		
		return new ResponseEntity<List<Flights>>(flights,
				new HttpHeaders(), HttpStatus.OK);
	}
}
