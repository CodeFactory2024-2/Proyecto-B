package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IFlightStatusEntity {
    // Getters
    BigInteger getIdFlightStatus();
    String getName();
    String getDescription();

    // Setters
    void setIdFlightStatus(BigInteger idFlightStatus);
    void setName(String name);
    void setDescription(String description);
}
