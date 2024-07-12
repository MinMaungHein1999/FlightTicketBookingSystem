package com.example.prototype;

import java.time.LocalDate;
import java.util.List;

import com.example.model.Flight;

public interface IFlightSearch {
    List<Flight> searchFlights(String departureCity, String arrivalCity, LocalDate departureDate);
}
