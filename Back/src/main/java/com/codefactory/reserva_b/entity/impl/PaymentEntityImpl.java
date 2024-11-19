package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPaymentEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "payment")
public class PaymentEntityImpl implements IPaymentEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private BigInteger idPayment;

    @Column(name = "id_booking", nullable = false)
    private BigInteger idBooking;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

    @Column(name = "id_payment_status", nullable = false)
    private BigInteger idPaymentStatus;

    @ManyToOne
    @JoinColumn(name = "id_payment_status", nullable = false, insertable = false, updatable = false)
    private PaymentStatusEntityImpl paymentStatus;

    @Column(name = "id_payment_method", nullable = false)
    private BigInteger idPaymentMethod;

    @ManyToOne
    @JoinColumn(name = "id_payment_method", nullable = false, insertable = false, updatable = false)
    private PaymentMethodEntityImpl paymentMethod;

    public PaymentEntityImpl() {}

    public PaymentEntityImpl(BigInteger idBooking, BigDecimal amount, LocalDateTime paymentDate, BigInteger idPaymentStatus, BigInteger idPaymentMethod) {
        this.idBooking = idBooking;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.idPaymentStatus = idPaymentStatus;
        this.idPaymentMethod = idPaymentMethod;
    }

    @Override
    public BigInteger getIdPayment() {
        return idPayment;
    }

    @Override
    public void setIdPayment(BigInteger idPayment) {
        this.idPayment = idPayment;
    }

    @Override
    public BigInteger getIdBooking() {
        return idBooking;
    }

    @Override
    public void setIdBooking(BigInteger idBooking) {
        this.idBooking = idBooking;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    @Override
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
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
    public PaymentStatusEntityImpl getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public void setPaymentStatus(PaymentStatusEntityImpl paymentStatus) {
        this.paymentStatus = paymentStatus;
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
    public PaymentMethodEntityImpl getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public void setPaymentMethod(PaymentMethodEntityImpl paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEntityImpl that = (PaymentEntityImpl) o;
        return Objects.equals(idPayment, that.idPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPayment);
    }

    @Override
    public String toString() {
        return "PaymentEntityImpl{" +
                "idPayment=" + idPayment +
                ", idBooking=" + idBooking +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", idPaymentStatus=" + idPaymentStatus +
                ", paymentStatus=" + paymentStatus +
                ", idPaymentMethod=" + idPaymentMethod +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
