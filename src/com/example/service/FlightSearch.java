package com.example.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.example.model.Flight;
import com.example.prototype.IFlightSearch;

public class FlightSearch implements IFlightSearch {
    private List<Flight> flights;

    public FlightSearch(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public List<Flight> searchFlights(String departureCity, String arrivalCity, LocalDate departureDate) {
        return flights.stream()
            .filter(flight -> flight.getDepartureCity().equalsIgnoreCase(departureCity) &&
                              flight.getArrivalCity().equalsIgnoreCase(arrivalCity) &&
                              flight.getDepartureTime().toLocalDate().equals(departureDate))
            .collect(Collectors.toList());
    }
}