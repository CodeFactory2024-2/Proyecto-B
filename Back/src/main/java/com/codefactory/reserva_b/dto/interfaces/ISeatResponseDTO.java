package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.SeatClassResponseDTOImpl;

public interface ISeatResponseDTO {
    Long getIdSeat();
    Long getIdFlight();
    String getSeatNumber();
    Boolean getIsReserved();
    Float getPrice();
    Long getIdSeatClass();
    SeatClassResponseDTOImpl getSeatClass();
}
