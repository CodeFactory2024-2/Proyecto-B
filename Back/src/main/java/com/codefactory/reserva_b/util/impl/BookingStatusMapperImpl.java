package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.BookingStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IBookingStatusEntity;
import com.codefactory.reserva_b.util.interfaces.IBookingStatusMapper;
import org.springframework.stereotype.Component;

@Component
public class BookingStatusMapperImpl implements IBookingStatusMapper {
    @Override
    public BookingStatusResponseDTOImpl mapBookingStatusEntityToBookingStatusResponseDTO(IBookingStatusEntity entity) {
        if (entity == null) {
            return null;
        }
        return new BookingStatusResponseDTOImpl(
                entity.getIdBookingStatus().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
