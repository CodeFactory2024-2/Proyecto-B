package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPaymentResponseDTO;

import java.time.LocalDateTime;

public class PaymentResponseDTOImpl implements IPaymentResponseDTO {
    private final Long idPayment;
    private final Long idBooking;
    private final Float amount;
    private final LocalDateTime paymentDate;
    private final Long idPaymentStatus;
    private final PaymentStatusResponseDTOImpl paymentStatus;
    private final Long idPaymentMethod;
    private final PaymentMethodResponseDTOImpl paymentMethod;

    public PaymentResponseDTOImpl(Long idPayment, Long idBooking, Float amount, LocalDateTime paymentDate, Long idPaymentStatus, PaymentStatusResponseDTOImpl paymentStatus, Long idPaymentMethod, PaymentMethodResponseDTOImpl paymentMethod) {
        this.idPayment = idPayment;
        this.idBooking = idBooking;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.idPaymentStatus = idPaymentStatus;
        this.paymentStatus = paymentStatus;
        this.idPaymentMethod = idPaymentMethod;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public Long getIdPayment() {
        return idPayment;
    }

    @Override
    public Long getIdBooking() {
        return idBooking;
    }

    @Override
    public Float getAmount() {
        return amount;
    }

    @Override
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    @Override
    public Long getIdPaymentStatus() { return idPaymentStatus; }

    @Override
    public PaymentStatusResponseDTOImpl getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public Long getIdPaymentMethod() {return idPaymentMethod; }

    @Override
    public PaymentMethodResponseDTOImpl getPaymentMethod() {
        return paymentMethod;
    }
}
