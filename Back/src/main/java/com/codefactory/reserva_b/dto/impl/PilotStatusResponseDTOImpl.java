package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPilotStatusResponseDTO;

public class PilotStatusResponseDTOImpl implements IPilotStatusResponseDTO {
    private final Long idPilotStatus;
    private final String name;
    private final String description;

    public PilotStatusResponseDTOImpl(Long idPilotStatus, String name, String description) {
        this.idPilotStatus = idPilotStatus;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdPilotStatus() {
        return idPilotStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
