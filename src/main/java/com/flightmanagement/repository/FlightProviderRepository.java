package com.flightmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightmanagement.entity.Provider;

public interface FlightProviderRepository extends JpaRepository<Provider, Integer>{

}
