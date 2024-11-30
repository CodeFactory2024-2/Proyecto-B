package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PilotStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPilotStatusEntity;
import com.codefactory.reserva_b.util.interfaces.IPilotStatusMapper;
import org.springframework.stereotype.Component;

@Component
public class PilotStatusMapperImpl implements IPilotStatusMapper {
    @Override
    public PilotStatusResponseDTOImpl mapPilotStatusEntityToPilotStatusResponseDTO(IPilotStatusEntity entity) {
        if (entity == null) {
            return null;
        }
        return new PilotStatusResponseDTOImpl(
                entity.getIdPilotStatus().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
