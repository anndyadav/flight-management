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

import com.flightmanagement.entity.Provider;
import com.flightmanagement.exception.FlightMgtException;
import com.flightmanagement.service.FlightProviderService;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {
	@Autowired
	FlightProviderService flightProviderService;
	
	@GetMapping
	public ResponseEntity<List<Provider>> findAll() {
		List<Provider> providers = flightProviderService.findAll();
		if(providers==null || providers.isEmpty()) 
			throw new FlightMgtException("provider not found!");
			
		return new ResponseEntity<List<Provider>>(providers, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/filter/{id}")
	public Optional<Provider> filterById(@PathVariable int id){
		return flightProviderService.findById(id);
	}
	
	@PutMapping("/addprovider")
	public Provider addProvider(@RequestBody Provider provider) {
		return flightProviderService.addProvider(provider);
	}
}
