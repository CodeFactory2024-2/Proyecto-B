package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IBookingEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.ILuggageTypeEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "luggage_type")
public class LuggageTypeEntityImpl implements ILuggageTypeEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_luggage_type", nullable = false)
    private BigInteger idLuggageType;

    @Column(name = "name", nullable = false)
    private String name;

    public LuggageTypeEntityImpl() {}

    public LuggageTypeEntityImpl(String name) {
        this.name = name;
    }

    @Override
    public BigInteger getIdLuggageType() {
        return idLuggageType;
    }

    @Override
    public void setIdLuggageType(BigInteger idLuggageType) {
        this.idLuggageType = idLuggageType;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuggageTypeEntityImpl that = (LuggageTypeEntityImpl) o;
        return Objects.equals(idLuggageType, that.idLuggageType);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idLuggageType);
    }

    @Override
    public String toString() {
        return "LuggageTypeEntityImpl{" +
                "idLuggageType=" + idLuggageType +
                ", name='" + name + '\'' +
                '}';
    }
}
