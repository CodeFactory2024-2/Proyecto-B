package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.BookingStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IBookingStatusEntity;

public interface IBookingStatusMapper {
    BookingStatusResponseDTOImpl mapBookingStatusEntityToBookingStatusResponseDTO(IBookingStatusEntity entity);
}
