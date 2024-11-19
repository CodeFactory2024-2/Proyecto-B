package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.PaymentMethodEntityImpl;
import com.codefactory.reserva_b.entity.impl.PaymentStatusEntityImpl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public interface IPaymentEntity {
    // Getters
    BigInteger getIdPayment();
    BigInteger getIdBooking();
    BigDecimal getAmount();
    LocalDateTime getPaymentDate();
    BigInteger getIdPaymentStatus();
    PaymentStatusEntityImpl getPaymentStatus();
    BigInteger getIdPaymentMethod();
    PaymentMethodEntityImpl getPaymentMethod();

    // Setters
    void setIdPayment(BigInteger idPayment);
    void setIdBooking(BigInteger idBooking);
    void setAmount(BigDecimal amount);
    void setPaymentDate(LocalDateTime paymentDate);
    void setIdPaymentStatus(BigInteger idPaymentStatus);
    void setPaymentStatus(PaymentStatusEntityImpl paymentStatus);
    void setIdPaymentMethod(BigInteger idPaymentMethod);
    void setPaymentMethod(PaymentMethodEntityImpl paymentMethod);
}
