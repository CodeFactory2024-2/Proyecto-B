package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface ISeatClassEntity {
    // Getters
    BigInteger getIdSeatClass();
    String getName();

    // Setters
    void setIdSeatClass(BigInteger idSeatClass);
    void setName(String name);
}
