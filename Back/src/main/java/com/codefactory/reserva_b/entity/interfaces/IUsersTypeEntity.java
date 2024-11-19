package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IUsersTypeEntity {
    // Getters
    BigInteger getIdUsersType();
    String getName();
    String getDescription();

    // Setters
    void setIdUsersType(BigInteger idUsersType);
    void setName(String name);
    void setDescription(String description);
}
