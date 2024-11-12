package com.udea.vueloudea.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class City {
    @Id
    @JsonProperty("iataCode")
    private String iataCode; // Código IATA (ej: BOG, MDE)
    @JsonProperty("airportName")
    private String airportName; // Nombre completo del aeropuerto
    @JsonProperty("country")
    private String country;

    public City() {

    }

    public City(String iataCode, String airportName, String country) {
        this.iataCode = iataCode;
        this.airportName = airportName;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    // Getters, Setters, Constructor, etc.
}
