package com.cloudapigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is taking longer than Expected."
				+ "Please try again later";
		}
	@GetMapping("/bookingServiceFallBack")
	public String bookingServiceFallBackMethod() {
		return "Booking Service is taking longer than Expected."
				+ "Please try again later";
		}
	@GetMapping("/vehicleServiceFallBack")
	public String vehicleServiceFallBackMethod() {
		return "Vehicle Service is taking longer than Expected."
				+ "Please try again later";
		}
	@GetMapping("/vendorServiceFallBack")
	public String vendorServiceFallBackMethod() {
		return "Vendor Service is taking longer than Expected."
				+ "Please try again later";
		}
	
}
