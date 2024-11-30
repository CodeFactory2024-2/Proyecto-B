package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPaymentStatusResponseDTO;

public class PaymentStatusResponseDTOImpl implements IPaymentStatusResponseDTO {
    private final Long idPaymentStatus;
    private final String name;
    private final String description;

    public PaymentStatusResponseDTOImpl(Long idPaymentStatus, String name, String description) {
        this.idPaymentStatus = idPaymentStatus;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdPaymentStatus() {
        return idPaymentStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
