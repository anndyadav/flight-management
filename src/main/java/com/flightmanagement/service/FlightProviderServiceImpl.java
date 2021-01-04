package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagement.entity.Provider;
import com.flightmanagement.exception.FlightMgtException;
import com.flightmanagement.repository.FlightProviderRepository;

@Service
public class FlightProviderServiceImpl implements FlightProviderService {
	
	@Autowired
	FlightProviderRepository flightProviderRepository;
	
	@Override
	public List<Provider> findAll() {
		return flightProviderRepository.findAll();
	}

	@Override
	public Optional<Provider> findById(int id) {
		Provider obj = flightProviderRepository.findById(id).orElse(null);
		if(obj==null) {
			throw new FlightMgtException("No Provider Found");
		}
		return flightProviderRepository.findById(id);
	}

	@Override
	public Provider addProvider(Provider provider) {
		return flightProviderRepository.save(provider);
	}

}
