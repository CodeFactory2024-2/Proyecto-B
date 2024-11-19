package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IPilotStatusEntity {
    // Getters
    BigInteger getIdPilotStatus();
    String getName();
    String getDescription();

    // Setters
    void setIdPilotStatus(BigInteger idPilotStatus);
    void setName(String name);
    void setDescription(String description);
}
