package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.ISeatClassEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "seat_class")
public class SeatClassEntityImpl implements ISeatClassEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seat_class", nullable = false)
    private BigInteger idSeatClass;

    @Column(name = "name", nullable = false)
    private String name;

    public SeatClassEntityImpl() {}

    public SeatClassEntityImpl(String name) {
        this.name = name;
    }

    @Override
    public BigInteger getIdSeatClass() {
        return idSeatClass;
    }

    @Override
    public void setIdSeatClass(BigInteger idSeatClass) {
        this.idSeatClass = idSeatClass;
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
        SeatClassEntityImpl that = (SeatClassEntityImpl) o;
        return Objects.equals(idSeatClass, that.idSeatClass);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idSeatClass);
    }

    @Override
    public String toString() {
        return "SeatClassEntityImpl{" +
                "idSeatClass=" + idSeatClass +
                ", name='" + name + '\'' +
                '}';
    }
}
