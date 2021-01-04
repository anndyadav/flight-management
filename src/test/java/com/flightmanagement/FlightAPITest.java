package com.flightmanagement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class FlightAPITest extends FlghtMgtApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void findAll() throws Exception {
		this.mockMvc.perform(get("/api/airports/filter/1")).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"NEW DELHI\",\"code\":\"DEL\"}"));
	}
	
	@Test
	public void getFlightsBetweenLocations() throws Exception {
		this.mockMvc.perform(get("/api/flights/filter/1/4")).andExpect(status().isOk())
				.andExpect(content().json("[{\"id\":5,\"start\":\"New Delhi\",\"destination\":\"Chennai\",\"departure\":\"4:00\",\"arrival\":\"8:00\",\"seats\":150,\"startCode\":1,\"destCode\":4,\"providerId\":1,\"provider\":{\"id\":1,\"name\":\"INDIGO\"}},{\"id\":69,\"start\":\"New Delhi\",\"destination\":\"Chennai\",\"departure\":\"4:00\",\"arrival\":\"8:00\",\"seats\":150,\"startCode\":1,\"destCode\":4,\"providerId\":2,\"provider\":{\"id\":2,\"name\":\"SPICEJET\"}}]"));
	}
	
	@Test
	public void getFlightsInfoByID() throws Exception {
		this.mockMvc.perform(get("/api/flights/filter/1/")).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"start\":\"New Delhi\",\"destination\":\"Kolkata\",\"departure\":\"8:00\",\"arrival\":\"10:00\",\"seats\":150,\"startCode\":1,\"destCode\":3,\"providerId\":1,\"provider\":{\"id\":1,\"name\":\"INDIGO\"}}"));
	}
}
