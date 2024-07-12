package com.example.prototype;

import com.example.model.Booking;
import com.example.model.Flight;
import com.example.model.Passenger;

public interface IBookingSystem {
    void bookTicket(Passenger passenger, Flight flight);
    void cancelBooking(int bookingId);
    Booking viewBooking(int bookingId);
}
