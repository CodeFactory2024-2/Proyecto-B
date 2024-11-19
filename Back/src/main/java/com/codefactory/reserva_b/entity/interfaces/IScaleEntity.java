package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.CityEntityImpl;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface IScaleEntity {
    // Getters
    BigInteger getIdScale();
    BigInteger getIdFlight();
    BigInteger getIdCity();
    CityEntityImpl getCity();
    LocalDateTime getArrivalTime();
    LocalDateTime getDepartureTime();
    LocalTime getLayoverDuration();

    // Setters
    void setIdScale(BigInteger idScale);
    void setIdFlight(BigInteger idFlight);
    void setIdCity(BigInteger idCity);
    void setCity(CityEntityImpl city);
    void setArrivalTime(LocalDateTime arrivalTime);
    void setDepartureTime(LocalDateTime departureTime);
    void setLayoverDuration(LocalTime layoverDuration);
}
