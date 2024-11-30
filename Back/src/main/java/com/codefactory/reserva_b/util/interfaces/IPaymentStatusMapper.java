package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.PaymentStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPaymentStatusEntity;

public interface IPaymentStatusMapper {
    PaymentStatusResponseDTOImpl mapPaymentStatusEntityToPaymentStatusResponseDTO(IPaymentStatusEntity entity);
}
