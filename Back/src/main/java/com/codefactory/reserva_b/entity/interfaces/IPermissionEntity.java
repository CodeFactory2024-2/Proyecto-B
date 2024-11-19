package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;

public interface IPermissionEntity {
    // Getters
    BigInteger getIdPermission();
    String getName();
    String getDescription();

    // Setters
    void setIdPermission(BigInteger idPermission);
    void setName(String name);
    void setDescription(String description);
}
