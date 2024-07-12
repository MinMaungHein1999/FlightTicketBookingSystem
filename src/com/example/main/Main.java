package com.example.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Booking;
import com.example.model.Flight;
import com.example.model.Passenger;
import com.example.service.BookingSystem;
import com.example.service.FlightSearch;

public class Main {

	public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("FL123", "New York", "Los Angeles", 
                               LocalDateTime.of(2024, 7, 15, 10, 0),
                               LocalDateTime.of(2024, 7, 15, 13, 0), 100));
        
        FlightSearch flightSearch = new FlightSearch(flights);
        BookingSystem bookingSystem = new BookingSystem();

        List<Flight> availableFlights = flightSearch.searchFlights("New York", "Los Angeles", LocalDate.of(2024, 7, 15));
        if (!availableFlights.isEmpty()) {
            Passenger passenger = new Passenger("John Doe", "A12345678", "john.doe@example.com");
            bookingSystem.bookTicket(passenger, availableFlights.get(0));

            Booking booking = bookingSystem.viewBooking(1);
            System.out.println("Booking ID: " + booking.getBookingId());
            System.out.println("Flight: " + booking.getFlight().getFlightNumber());
            System.out.println("Passenger: " + booking.getPassenger().getName());
        }
    }

}
