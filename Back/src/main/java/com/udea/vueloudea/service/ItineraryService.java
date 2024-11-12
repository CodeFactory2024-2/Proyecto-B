package com.udea.vueloudea.service;

import com.udea.vueloudea.model.City;
import com.udea.vueloudea.model.Flight;
import com.udea.vueloudea.model.FlightItinerary;
import com.udea.vueloudea.repository.ICityRepository;
import com.udea.vueloudea.repository.IItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItineraryService {

    @Autowired
    private IItineraryRepository flightRepository;
    @Autowired
    private ICityRepository cityRepository;

    public FlightItinerary findItinerary(City origin, City destination) {
        List<Flight> flights = flightRepository.findFlightsByOriginAndDestination(origin, destination);
        if (flights.isEmpty()) {
            flights = findConnectingFlights(origin, destination);
            if (flights.isEmpty()) {
                throw new RuntimeException("No flights found for the given origin and destination");
            }
        }
        return new FlightItinerary(flights);
    }

    private List<Flight> findConnectingFlights(City origin, City destination) {
        List<Flight> allFlights = flightRepository.findAll();
        List<Flight> validItinerary = new ArrayList<>();
        findConnectingFlightsRecursive(allFlights, origin, destination, validItinerary, new ArrayList<>());
        return validItinerary;
    }

    private void findConnectingFlightsRecursive(List<Flight> allFlights, City currentCity, City destination, List<Flight> validItinerary, List<Flight> currentItinerary) {
        if (currentCity.equals(destination)) {
            validItinerary.addAll(new ArrayList<>(currentItinerary));
            return;
        }

        for (Flight flight : allFlights) {
            if (flight.getOrigin().equals(currentCity) && !currentItinerary.contains(flight)) {
                if (!currentItinerary.isEmpty()) {
                    Flight lastFlight = currentItinerary.get(currentItinerary.size() - 1);
                    Duration layover = Duration.between(lastFlight.getArrivalTime(), flight.getDepartureTime());
                    if (layover.toHours() < 1 || layover.toHours() > 6) {
                        continue;
                    }
                }
                currentItinerary.add(flight);
                findConnectingFlightsRecursive(allFlights, flight.getDestination(), destination, validItinerary, currentItinerary);
                currentItinerary.remove(flight);
            }
        }
    }

    public City findCityByIataCode(String iataCode) {
        return cityRepository.findByIataCode(iataCode)
                .orElseThrow(() -> new RuntimeException("City with IATA code " + iataCode + " not found"));
    }
}