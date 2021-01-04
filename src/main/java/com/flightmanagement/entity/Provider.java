package com.flightmanagement.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="FLIGHTPROVIDER")
public class Provider {
	@Id
	private Integer id;
	private String name;
	
	@JsonIgnoreProperties("provider")
	@OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
	private Set<Flights> flights;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Flights> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flights> flights) {
		this.flights = flights;
	}
	
	
}
