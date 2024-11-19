package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IBookingEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IFlightStatusEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "flight_status")
public class FlightStatusEntityImpl implements IFlightStatusEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight_status", nullable = false)
    private BigInteger idFlightStatus;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public FlightStatusEntityImpl() {}

    public FlightStatusEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdFlightStatus() {
        return idFlightStatus;
    }

    @Override
    public void setIdFlightStatus(BigInteger idFlightStatus) {
        this.idFlightStatus = idFlightStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightStatusEntityImpl that = (FlightStatusEntityImpl) o;
        return Objects.equals(idFlightStatus, that.idFlightStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFlightStatus);
    }

    @Override
    public String toString() {
        return "FlightStatusEntityImpl{" +
                "idFlightStatus=" + idFlightStatus +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
