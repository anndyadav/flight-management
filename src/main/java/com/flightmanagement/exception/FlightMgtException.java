package com.flightmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightMgtException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FlightMgtException(String message) {
		super(message);
	}
}
