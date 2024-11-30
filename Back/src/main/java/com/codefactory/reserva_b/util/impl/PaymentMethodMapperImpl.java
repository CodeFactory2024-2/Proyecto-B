package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PaymentMethodResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPaymentMethodEntity;
import com.codefactory.reserva_b.util.interfaces.IPaymentMethodMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentMethodMapperImpl implements IPaymentMethodMapper {
    @Override
    public PaymentMethodResponseDTOImpl mapPaymentMethodEntityToPaymentMethodResponseDTO(IPaymentMethodEntity entity) {
        if (entity == null) {
            return null;
        }
        return new PaymentMethodResponseDTOImpl(
                entity.getIdPaymentMethod().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
