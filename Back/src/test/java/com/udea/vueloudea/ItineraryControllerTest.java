package com.udea.vueloudea;

import com.udea.vueloudea.controller.ItineraryController;
import com.udea.vueloudea.model.City;
import com.udea.vueloudea.model.Flight;
import com.udea.vueloudea.model.FlightItinerary;
import com.udea.vueloudea.service.ItineraryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ItineraryControllerTest {

    @Mock
    private ItineraryService itineraryService;

    @InjectMocks
    private ItineraryController itineraryController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

@Test
public void testFindItinerary() {
    City originCity = new City("MDE", "Aeropuerto Internacional José María Córdova - Rionegro (Medellín)", "Colombia");
    City layoverCity = new City("CLO", "Aeropuerto Internacional Alfonso Bonilla Aragón - Cali", "Colombia");
    City destinationCity = new City("BOG", "Aeropuerto Internacional El Dorado - Bogotá", "Colombia");

    Flight flight1 = new Flight();
    flight1.setOrigin(originCity); // Asignar la ciudad de origen al primer vuelo
    flight1.setDestination(layoverCity); // Asignar la ciudad de escala al primer vuelo
    flight1.setDepartureTime(LocalTime.from(LocalDateTime.of(2023, 10, 1, 10, 0))); // Asignar una hora de salida válida
    flight1.setArrivalTime(LocalTime.from(LocalDateTime.of(2023, 10, 1, 11, 0))); // Asignar una hora de llegada válida

    Flight flight2 = new Flight();
    flight2.setOrigin(layoverCity); // Asignar la ciudad de origen al segundo vuelo
    flight2.setDestination(destinationCity); // Asignar la ciudad de destino al segundo vuelo
    flight2.setDepartureTime(LocalTime.from(LocalDateTime.of(2023, 10, 1, 12, 0))); // Asignar una hora de salida válida
    flight2.setArrivalTime(LocalTime.from(LocalDateTime.of(2023, 10, 1, 13, 0))); // Asignar una hora de llegada válida

    List<Flight> flights = List.of(flight1, flight2); // Crear una lista con los vuelos de ejemplo
    FlightItinerary flightItinerary = new FlightItinerary(flights);

    when(itineraryService.findCityByIataCode("MDE")).thenReturn(originCity);
    when(itineraryService.findCityByIataCode("CLO")).thenReturn(layoverCity);
    when(itineraryService.findCityByIataCode("BOG")).thenReturn(destinationCity);
    when(itineraryService.findItinerary(originCity, destinationCity)).thenReturn(flightItinerary);

    FlightItinerary result = itineraryController.findItinerary("MDE", "BOG");
    assertEquals("MDE", result.getOrigin());
    assertEquals("BOG", result.getDestination());
}

    @Test
    public void testFindItineraryNoFlightsFound() {
        when(itineraryService.findCityByIataCode(anyString())).thenThrow(new RuntimeException("City not found"));

        try {
            itineraryController.findItinerary("MDE", "BOG");
        } catch (RuntimeException e) {
            assertEquals("City not found", e.getMessage());
        }
    }
}