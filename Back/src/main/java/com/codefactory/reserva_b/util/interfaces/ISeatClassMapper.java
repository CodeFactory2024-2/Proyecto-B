package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.SeatClassResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.ISeatClassEntity;

public interface ISeatClassMapper {
    SeatClassResponseDTOImpl mapSeatClassEntityToSeatClassResponseDTO(ISeatClassEntity entity);
}
