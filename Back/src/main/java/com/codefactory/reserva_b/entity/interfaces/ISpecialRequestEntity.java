package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface ISpecialRequestEntity {
    // Getters
    BigInteger getIdSpecialRequest();
    String getName();
    String getDescription();

    // Setters
    void setIdSpecialRequest(BigInteger idSpecialRequest);
    void setName(String name);
    void setDescription(String description);
}
