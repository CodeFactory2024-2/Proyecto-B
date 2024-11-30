package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.PaymentMethodResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PaymentStatusResponseDTOImpl;

import java.time.LocalDateTime;

public interface IPaymentResponseDTO {
    Long getIdPayment();
    Long getIdBooking();
    Float getAmount();
    LocalDateTime getPaymentDate();
    Long getIdPaymentStatus();
    PaymentStatusResponseDTOImpl getPaymentStatus();
    Long getIdPaymentMethod();
    PaymentMethodResponseDTOImpl getPaymentMethod();
}
