package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPaymentMethodEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "payment_method")
public class PaymentMethodEntityImpl implements IPaymentMethodEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment_method", nullable = false)
    private BigInteger idPaymentMethod;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public PaymentMethodEntityImpl() {}

    public PaymentMethodEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdPaymentMethod() {
        return idPaymentMethod;
    }

    @Override
    public void setIdPaymentMethod(BigInteger idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
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
        PaymentMethodEntityImpl that = (PaymentMethodEntityImpl) o;
        return Objects.equals(idPaymentMethod, that.idPaymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPaymentMethod);
    }

    @Override
    public String toString() {
        return "PaymentMethodEntityImpl{" +
                "idPaymentMethod=" + idPaymentMethod +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
