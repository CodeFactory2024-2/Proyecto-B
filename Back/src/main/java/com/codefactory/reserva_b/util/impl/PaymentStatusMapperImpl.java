package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PaymentStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPaymentStatusEntity;
import com.codefactory.reserva_b.util.interfaces.IPaymentStatusMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentStatusMapperImpl implements IPaymentStatusMapper {
    @Override
    public PaymentStatusResponseDTOImpl mapPaymentStatusEntityToPaymentStatusResponseDTO(IPaymentStatusEntity entity) {
        if (entity == null) {
            return null;
        }
        return new PaymentStatusResponseDTOImpl(
                entity.getIdPaymentStatus().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
