package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IFlightStatusResponseDTO;

public class FlightStatusResponseDTOImpl implements IFlightStatusResponseDTO {
    private final Long idFlightStatus;
    private final String name;
    private final String description;

    public FlightStatusResponseDTOImpl(Long idFlightStatus, String name, String description) {
        this.idFlightStatus = idFlightStatus;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdFlightStatus() {
        return idFlightStatus;
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
