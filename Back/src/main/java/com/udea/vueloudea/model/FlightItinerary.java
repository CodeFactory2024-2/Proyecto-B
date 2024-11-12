package com.udea.vueloudea.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightItinerary {
    private List<Flight> flights;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private Duration totalDuration;
    private List<Duration> layoverTimes;
    private double totalPrice;

    // Constructor, getters, and setters

    public FlightItinerary(List<Flight> flights) {
        if (flights == null || flights.isEmpty()) {
            throw new IllegalArgumentException("The flight list cannot be null or empty");
        }
        this.flights = flights;
        this.origin = flights.get(0).getOrigin().getIataCode();
        this.destination = flights.get(flights.size() - 1).getDestination().getIataCode();
        this.departureDate = flights.get(0).getDepartureDate();
        this.arrivalDate = flights.get(flights.size() - 1).getArrivalDate();
        this.totalDuration = calculateTotalDuration();
        this.layoverTimes = calculateLayoverTimes();
        this.totalPrice = calculateTotalPrice();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public Duration getTotalDuration() {
        return totalDuration;
    }

    public List<Duration> getLayoverTimes() {
        return layoverTimes;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private Duration calculateTotalDuration() {
        Duration totalDuration = Duration.ZERO;

        for (Flight flight : flights) {
            Duration flightDuration = Duration.between(flight.getDepartureTime(), flight.getArrivalTime());
            totalDuration = totalDuration.plus(flightDuration);
        }

        for (Duration layover : calculateLayoverTimes()) {
            totalDuration = totalDuration.plus(layover);
        }

        return totalDuration;
    }

    private List<Duration> calculateLayoverTimes() {
        List<Duration> layoverTimes = new ArrayList<>();

        for (int i = 0; i < flights.size() - 1; i++) {
            Flight currentFlight = flights.get(i);
            Flight nextFlight = flights.get(i + 1);
            Duration layover = Duration.between(currentFlight.getArrivalTime(), nextFlight.getDepartureTime());
            layoverTimes.add(layover);
        }

        return layoverTimes;
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;

        for (Flight flight : flights) {
            double priceWithTax = flight.getPrice() * (1 + flight.getTaxPercentage() / 100);
            double priceWithSurcharge = priceWithTax * (1 + flight.getSurchargePercentage() / 100);
            totalPrice += priceWithSurcharge;
        }

        return totalPrice;
    }
}