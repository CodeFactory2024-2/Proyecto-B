package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPaymentMethodResponseDTO;

public class PaymentMethodResponseDTOImpl implements IPaymentMethodResponseDTO {
    private final Long idPaymentMethod;
    private final String name;
    private final String description;

    public PaymentMethodResponseDTOImpl(Long idPaymentMethod, String name, String description) {
        this.idPaymentMethod = idPaymentMethod;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdPaymentMethod() {
        return idPaymentMethod;
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
