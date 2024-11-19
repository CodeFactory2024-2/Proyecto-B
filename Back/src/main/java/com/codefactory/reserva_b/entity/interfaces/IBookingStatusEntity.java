package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IBookingStatusEntity {
    // Getters
    BigInteger getIdBookingStatus();
    String getName();
    String getDescription();

    // Setters
    void setIdBookingStatus(BigInteger idBookingStatus);
    void setName(String name);
    void setDescription(String description);
}

