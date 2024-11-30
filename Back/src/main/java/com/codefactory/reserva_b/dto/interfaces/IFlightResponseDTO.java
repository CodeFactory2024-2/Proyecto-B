package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.*;

import java.time.LocalDateTime;
import java.util.List;

public interface IFlightResponseDTO {
    Long getIdFlight();
    String getFlightNumber();
    Long getIdPlane();
    PlaneResponseDTOImpl getPlane();
    Long getIdDepartureCity();
    CityResponseDTOImpl getDepartureCity();
    Long getIdArrivalCity();
    CityResponseDTOImpl getArrivalCity();
    LocalDateTime getDepartureTime();
    LocalDateTime getArrivalTime();
    Long getIdFlightStatus();
    FlightStatusResponseDTOImpl getFlightStatus();
    String getFlightDuration();
    Float getDistanceKm();
    Integer getSeats();
    Long getIdCaptain();
    PilotResponseDTOImpl getCaptain();
    Long getIdSubCaptain();
    PilotResponseDTOImpl getSubCaptain();
    Float getPriceEconomy();
    Float getPriceBusiness();
    Float getPriceFirstClass();
    List<ScaleResponseDTOImpl> getScales();
}
