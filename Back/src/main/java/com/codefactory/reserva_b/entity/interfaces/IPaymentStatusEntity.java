package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IPaymentStatusEntity {
    // Getters
    BigInteger getIdPaymentStatus();
    String getName();
    String getDescription();

    // Setters
    void setIdPaymentStatus(BigInteger idPaymentStatus);
    void setName(String name);
    void setDescription(String description);
}
