package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IBookingStatusEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "booking_status")
public class BookingStatusEntityImpl implements IBookingStatusEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_booking_status", nullable = false)
    private BigInteger idBookingStatus;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public BookingStatusEntityImpl() {}

    public BookingStatusEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdBookingStatus() {
        return idBookingStatus;
    }

    @Override
    public void setIdBookingStatus(BigInteger idBookingStatus) {
        this.idBookingStatus = idBookingStatus;
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
        BookingStatusEntityImpl that = (BookingStatusEntityImpl) o;
        return Objects.equals(idBookingStatus, that.idBookingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idBookingStatus);
    }

    @Override
    public String toString() {
        return "BookingStatusEntityImpl{" +
                "idBookingStatus=" + idBookingStatus +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
