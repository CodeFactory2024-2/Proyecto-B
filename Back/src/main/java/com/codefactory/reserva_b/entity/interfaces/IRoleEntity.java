package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.PermissionEntityImpl;

import java.math.BigInteger;
import java.util.List;

public interface IRoleEntity {
    // Getters
    BigInteger getIdRole();
    String getName();
    String getDescription();
    List<PermissionEntityImpl> getPermissions();

    // Setters
    void setIdRole(BigInteger idRole);
    void setName(String name);
    void setDescription(String description);
    void setPermissions(List<PermissionEntityImpl> permissions);
}
