package com.udea.vueloudea.controller;

import com.udea.vueloudea.model.City;
import com.udea.vueloudea.model.FlightItinerary;
import com.udea.vueloudea.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
public class ItineraryController {

    @Autowired
    private ItineraryService flightItineraryService;

    @QueryMapping
    public FlightItinerary findItinerary(@Argument String origin, @Argument String destination) {
        // Validar y sanitizar los parámetros de entrada
        if (origin == null || origin.isEmpty() || !origin.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid origin IATA code");
        }
        if (destination == null || destination.isEmpty() || !destination.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid destination IATA code");
        }

        // Sanitizar los códigos IATA
        origin = origin.trim().toUpperCase();
        destination = destination.trim().toUpperCase();

        City originCity = flightItineraryService.findCityByIataCode(origin);
        City destinationCity = flightItineraryService.findCityByIataCode(destination);
        return flightItineraryService.findItinerary(originCity, destinationCity);
    }
}