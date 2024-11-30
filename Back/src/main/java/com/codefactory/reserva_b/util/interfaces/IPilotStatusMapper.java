package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.PilotStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPilotStatusEntity;

public interface IPilotStatusMapper {
    PilotStatusResponseDTOImpl mapPilotStatusEntityToPilotStatusResponseDTO(IPilotStatusEntity entity);
}
