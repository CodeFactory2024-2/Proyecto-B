package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IRoleEntity {
    // Getters
    BigInteger getIdRole();
    String getName();
    String getDescription();

    // Setters
    void setIdRole(BigInteger idRole);
    void setName(String name);
    void setDescription(String description);
}
