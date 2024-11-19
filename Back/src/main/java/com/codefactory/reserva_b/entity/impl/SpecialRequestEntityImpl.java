package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.ISpecialRequestEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "special_request")
public class SpecialRequestEntityImpl implements ISpecialRequestEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_special_request", nullable = false)
    private BigInteger idSpecialRequest;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public SpecialRequestEntityImpl() {}

    public SpecialRequestEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdSpecialRequest() {
        return idSpecialRequest;
    }

    @Override
    public void setIdSpecialRequest(BigInteger idSpecialRequest) {
        this.idSpecialRequest = idSpecialRequest;
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
        SpecialRequestEntityImpl that = (SpecialRequestEntityImpl) o;
        return Objects.equals(idSpecialRequest, that.idSpecialRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idSpecialRequest);
    }

    @Override
    public String toString() {
        return "SpecialRequestEntityImpl{" +
                "idSpecialRequest=" + idSpecialRequest +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
