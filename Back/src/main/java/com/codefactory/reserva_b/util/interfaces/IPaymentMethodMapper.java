package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.PaymentMethodResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPaymentMethodEntity;

public interface IPaymentMethodMapper {
    PaymentMethodResponseDTOImpl mapPaymentMethodEntityToPaymentMethodResponseDTO(IPaymentMethodEntity entity);
}
