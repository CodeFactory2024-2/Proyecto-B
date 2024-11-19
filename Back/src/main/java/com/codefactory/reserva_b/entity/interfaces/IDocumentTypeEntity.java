package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IDocumentTypeEntity {
    // Getters
    BigInteger getIdDocumentType();
    String getName();

    // Setters
    void setIdDocumentType(BigInteger idDocumentType);
    void setName(String name);
}