package com.flightmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightmanagement.entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, Integer>{

}
