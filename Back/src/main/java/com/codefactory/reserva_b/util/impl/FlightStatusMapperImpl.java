package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.FlightStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IFlightStatusEntity;
import com.codefactory.reserva_b.util.interfaces.IFlightStatusMapper;
import org.springframework.stereotype.Component;

@Component
public class FlightStatusMapperImpl implements IFlightStatusMapper {
    @Override
    public FlightStatusResponseDTOImpl mapFlightStatusEntityToFlightStatusResponseDTO(IFlightStatusEntity entity) {
        if (entity == null) {
            return null;
        }
        return new FlightStatusResponseDTOImpl(
                entity.getIdFlightStatus().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
