package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IBookingEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPermissionEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "permission")
public class PermissionEntityImpl implements IPermissionEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permission", nullable = false)
    private BigInteger idPermission;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Override
    public BigInteger getIdPermission() {
        return idPermission;
    }

    @Override
    public void setIdPermission(BigInteger idPermission) {
        this.idPermission = idPermission;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionEntityImpl that = (PermissionEntityImpl) o;
        return Objects.equals(idPermission, that.idPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPermission);
    }

    @Override
    public String toString() {
        return "PermissionEntityImpl{" +
                "idPermission=" + idPermission +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
