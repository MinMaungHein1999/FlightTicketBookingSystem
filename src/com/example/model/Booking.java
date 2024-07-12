package com.example.model;

public class Booking {
    
	private int bookingId;
    private Flight flight;
    private Passenger passenger;
    private String status;
    
    
	public Booking(int bookingId, Flight flight, Passenger passenger, String status) {
		super();
		this.bookingId = bookingId;
		this.flight = flight;
		this.passenger = passenger;
		this.status = status;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public Flight getFlight() {
		return flight;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public String getStatus() {
		return status;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", flight=" + flight + ", passenger=" + passenger + ", status="
				+ status + "]";
	}
}