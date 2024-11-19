package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface ILuggageTypeEntity {
    // Getters
    BigInteger getIdLuggageType();
    String getName();

    // Setters
    void setIdLuggageType(BigInteger idLuggageType);
    void setName(String name);
}
