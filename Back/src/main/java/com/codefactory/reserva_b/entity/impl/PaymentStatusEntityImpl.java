package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IBookingEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPaymentStatusEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "payment_status")
public class PaymentStatusEntityImpl implements IPaymentStatusEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment_status", nullable = false)
    private BigInteger idPaymentStatus;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public PaymentStatusEntityImpl() {}

    public PaymentStatusEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdPaymentStatus() {
        return idPaymentStatus;
    }

    @Override
    public void setIdPaymentStatus(BigInteger idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
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
        PaymentStatusEntityImpl that = (PaymentStatusEntityImpl) o;
        return Objects.equals(idPaymentStatus, that.idPaymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPaymentStatus);
    }

    @Override
    public String toString() {
        return "PaymentStatusEntityImpl{" +
                "idPaymentStatus=" + idPaymentStatus +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
