package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.FlightStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IFlightStatusEntity;

public interface IFlightStatusMapper {
    FlightStatusResponseDTOImpl mapFlightStatusEntityToFlightStatusResponseDTO(IFlightStatusEntity entity);
}
