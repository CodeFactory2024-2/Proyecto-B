package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPilotStatusEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "pilot_status")
public class PilotStatusEntityImpl implements IPilotStatusEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pilot_status", nullable = false)
    private BigInteger idPilotStatus;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public PilotStatusEntityImpl() {}

    public PilotStatusEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdPilotStatus() {
        return idPilotStatus;
    }

    @Override
    public void setIdPilotStatus(BigInteger idPilotStatus) {
        this.idPilotStatus = idPilotStatus;
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
        PilotStatusEntityImpl that = (PilotStatusEntityImpl) o;
        return Objects.equals(idPilotStatus, that.idPilotStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPilotStatus);
    }

    @Override
    public String toString() {
        return "PilotStatusEntityImpl{" +
                "idPilotStatus=" + idPilotStatus +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
