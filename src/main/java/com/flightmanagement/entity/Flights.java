package com.flightmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FLIGHTS")
public class Flights {
	@Id
	private Integer id;
	@Column(name="START")
	private String start;
	@Column(name="DESTINATION")
	private String destination;
	@Column(name="DEPARTURE")
	private String departure;
	@Column(name="ARRIVAL")
	private String arrival;
	@Column(name="SEATS")
	private Integer seats;
	@Column(name="STARTCODE")
	private Integer startCode;
	@Column(name="DESTCODE")
	private Integer destCode;	
	@Column(name = "PROVIDER_ID")
	private Integer providerId;
	
	@JsonIgnoreProperties({"flights","hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "PROVIDER_ID")
	private Provider provider;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getStartCode() {
		return startCode;
	}

	public void setStartCode(Integer startCode) {
		this.startCode = startCode;
	}

	public Integer getDestCode() {
		return destCode;
	}

	public void setDestCode(Integer destCode) {
		this.destCode = destCode;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	
	

	
}
