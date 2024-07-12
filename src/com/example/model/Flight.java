package com.example.model;

import java.time.LocalDateTime;

public class Flight {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;
 
    
	public Flight(String flightNumber, String departureCity, String arrivalCity, LocalDateTime departureTime,
			LocalDateTime arrivalTime, int availableSeats) {
		super();
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", arrivalCity="
				+ arrivalCity + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", availableSeats=" + availableSeats + "]";
	}

}
