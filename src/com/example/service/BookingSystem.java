package com.example.service;

import java.util.HashMap;
import java.util.Map;

import com.example.model.Booking;
import com.example.model.Flight;
import com.example.model.Passenger;
import com.example.prototype.IBookingSystem;

public class BookingSystem implements IBookingSystem {
    private Map<Integer, Booking> bookings;
    private int nextBookingId = 1;

    public BookingSystem() {
        bookings = new HashMap<>();
    }

    @Override
    public void bookTicket(Passenger passenger, Flight flight) {
        Booking booking = new Booking(nextBookingId++, flight, passenger, "Booked");
        bookings.put(booking.getBookingId(), booking);
        flight.setAvailableSeats(flight.getAvailableSeats() - 1);
    }

    @Override
    public void cancelBooking(int bookingId) {
        Booking booking = bookings.get(bookingId);
        if (booking != null) {
            booking.setStatus("Cancelled");
            booking.getFlight().setAvailableSeats(booking.getFlight().getAvailableSeats() + 1);
        }
    }

    @Override
    public Booking viewBooking(int bookingId) {
        return bookings.get(bookingId);
    }
}

