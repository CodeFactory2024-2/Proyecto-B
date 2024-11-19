package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IUsersTypeEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "users_type")
public class UsersTypeEntityImpl implements IUsersTypeEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users_type", nullable = false)
    private BigInteger idUsersType;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public UsersTypeEntityImpl() {}

    public UsersTypeEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdUsersType() {
        return idUsersType;
    }

    @Override
    public void setIdUsersType(BigInteger idUsersType) {
        this.idUsersType = idUsersType;
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
        UsersTypeEntityImpl that = (UsersTypeEntityImpl) o;
        return Objects.equals(idUsersType, that.idUsersType);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idUsersType);
    }

    @Override
    public String toString() {
        return "UsersTypeEntityImpl{" +
                "idUsersType=" + idUsersType +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
