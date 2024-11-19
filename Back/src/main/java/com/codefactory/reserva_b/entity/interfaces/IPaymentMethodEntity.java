package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IPaymentMethodEntity {
    // Getters
    BigInteger getIdPaymentMethod();
    String getName();
    String getDescription();

    // Setters
    void setIdPaymentMethod(BigInteger idPaymentMethod);
    void setName(String name);
    void setDescription(String description);
}
