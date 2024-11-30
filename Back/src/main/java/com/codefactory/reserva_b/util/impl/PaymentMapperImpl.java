package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PaymentMethodResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PaymentResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PaymentStatusResponseDTOImpl;
import com.codefactory.reserva_b.dto.interfaces.IPaymentResponseDTO;
import com.codefactory.reserva_b.entity.interfaces.IPaymentEntity;
import com.codefactory.reserva_b.entity.interfaces.IPaymentMethodEntity;
import com.codefactory.reserva_b.util.interfaces.IPaymentMapper;
import com.codefactory.reserva_b.util.interfaces.IPaymentMethodMapper;
import com.codefactory.reserva_b.util.interfaces.IPaymentStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PaymentMapperImpl implements IPaymentMapper {
    @Autowired
    private IPaymentStatusMapper paymentStatusMapper;
    @Autowired
    private IPaymentMethodMapper paymentMethodMapper;
    @Override
    public PaymentResponseDTOImpl mapPaymentEntityToPaymentResponseDTO(IPaymentEntity paymentEntity) {
        if (paymentEntity == null) {
            return null;
        }
        Long idPayment = paymentEntity.getIdPayment().longValue();
        Long idBooking = paymentEntity.getIdBooking().longValue();
        Float amount = paymentEntity.getAmount() != null ? paymentEntity.getAmount().floatValue() : null;
        LocalDateTime paymentDate = paymentEntity.getPaymentDate();
        Long idPaymentStatus = paymentEntity.getIdPaymentStatus().longValue();
        Long idPaymentMethod = paymentEntity.getIdPaymentMethod().longValue();
        PaymentStatusResponseDTOImpl paymentStatus = paymentEntity.getPaymentStatus() != null ?
                paymentStatusMapper.mapPaymentStatusEntityToPaymentStatusResponseDTO(paymentEntity.getPaymentStatus()) : null;
        PaymentMethodResponseDTOImpl paymentMethod = paymentEntity.getPaymentMethod() != null ?
                paymentMethodMapper.mapPaymentMethodEntityToPaymentMethodResponseDTO(paymentEntity.getPaymentMethod()) : null;

        return new PaymentResponseDTOImpl(
                idPayment,
                idBooking,
                amount,
                paymentDate,
                idPaymentStatus,
                paymentStatus,
                idPaymentMethod,
                paymentMethod
        );
    }
}
