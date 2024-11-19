package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IScaleEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "scale")
public class ScaleEntityImpl implements IScaleEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_scale")
    private BigInteger idScale;

    @Column(name = "id_flight", nullable = false)
    private BigInteger idFlight;

    @Column(name = "id_city", nullable = false)
    private BigInteger idCity;

    @ManyToOne
    @JoinColumn(name = "id_city", nullable = false, insertable=false, updatable=false)
    private CityEntityImpl city;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "layover_duration", nullable = false)
    private LocalTime layoverDuration;

    public ScaleEntityImpl() {}

    public ScaleEntityImpl(BigInteger idFlight, BigInteger idCity, LocalDateTime arrivalTime, LocalDateTime departureTime, LocalTime layoverDuration) {
        this.idFlight = idFlight;
        this.idCity = idCity;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.layoverDuration = layoverDuration;
    }

    @Override
    public BigInteger getIdScale() {
        return idScale;
    }

    @Override
    public void setIdScale(BigInteger idScale) {
        this.idScale = idScale;
    }

    @Override
    public BigInteger getIdFlight() {
        return idFlight;
    }

    @Override
    public void setIdFlight(BigInteger idFlight) {
        this.idFlight = idFlight;
    }

    @Override
    public BigInteger getIdCity() {
        return idCity;
    }

    @Override
    public void setIdCity(BigInteger idCity) {
        this.idCity = idCity;
    }

    @Override
    public CityEntityImpl getCity() {
        return city;
    }

    @Override
    public void setCity(CityEntityImpl city) {
        this.city = city;
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public LocalTime getLayoverDuration() {
        return layoverDuration;
    }

    @Override
    public void setLayoverDuration(LocalTime layoverDuration) {
        this.layoverDuration = layoverDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScaleEntityImpl that = (ScaleEntityImpl) o;
        return Objects.equals(idScale, that.idScale);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idScale);
    }

    @Override
    public String toString() {
        return "ScaleEntityImpl{" +
                "idScale=" + idScale +
                ", idFlight=" + idFlight +
                ", idCity=" + idCity +
                ", city=" + city +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", layoverDuration=" + layoverDuration +
                '}';
    }
}
