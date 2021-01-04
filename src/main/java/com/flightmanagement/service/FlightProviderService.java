package com.flightmanagement.service;

import java.util.List;
import java.util.Optional;

import com.flightmanagement.entity.Provider;

public interface FlightProviderService {
	List<Provider> findAll();
	Optional<Provider> findById(int id);
	Provider addProvider(Provider provider);
}
